package com.woowla.compose.icon.collections.boxicons.boxicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.SolidGroup

public val SolidGroup.BxsCar: ImageVector
    get() {
        if (_bxsCar != null) {
            return _bxsCar!!
        }
        _bxsCar = Builder(name = "BxsCar", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.772f, 10.155f)
                lineToRelative(-1.368f, -4.104f)
                arcTo(2.995f, 2.995f, 0.0f, false, false, 16.559f, 4.0f)
                lineTo(7.441f, 4.0f)
                arcToRelative(2.995f, 2.995f, 0.0f, false, false, -2.845f, 2.051f)
                lineToRelative(-1.368f, 4.104f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 2.0f, 12.0f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 0.738f, 0.404f, 1.376f, 1.0f, 1.723f)
                lineTo(3.0f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                verticalLineToRelative(-2.277f)
                arcTo(1.99f, 1.99f, 0.0f, false, false, 22.0f, 17.0f)
                verticalLineToRelative(-5.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.228f, -1.845f)
                close()
                moveTo(7.441f, 6.0f)
                horizontalLineToRelative(9.117f)
                curveToRelative(0.431f, 0.0f, 0.813f, 0.274f, 0.949f, 0.684f)
                lineTo(18.613f, 10.0f)
                lineTo(5.387f, 10.0f)
                lineToRelative(1.105f, -3.316f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 7.441f, 6.0f)
                close()
                moveTo(5.5f, 16.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.001f, -3.001f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 5.5f, 16.0f)
                close()
                moveTo(18.5f, 16.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.001f, -3.001f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 18.5f, 16.0f)
                close()
            }
        }
        .build()
        return _bxsCar!!
    }

private var _bxsCar: ImageVector? = null
