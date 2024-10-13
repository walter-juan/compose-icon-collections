package com.woowla.compose.icon.collections.boxicons.boxicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.SolidGroup

public val SolidGroup.BxsCarGarage: ImageVector
    get() {
        if (_bxsCarGarage != null) {
            return _bxsCarGarage!!
        }
        _bxsCarGarage = Builder(name = "BxsCarGarage", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 19.723f)
                lineTo(3.0f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                verticalLineToRelative(-1.277f)
                arcTo(1.99f, 1.99f, 0.0f, false, false, 22.0f, 18.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -0.831f, -0.507f, -1.542f, -1.228f, -1.845f)
                lineToRelative(-1.368f, -4.104f)
                arcTo(2.995f, 2.995f, 0.0f, false, false, 16.559f, 7.0f)
                lineTo(7.441f, 7.0f)
                arcToRelative(2.995f, 2.995f, 0.0f, false, false, -2.845f, 2.051f)
                lineToRelative(-1.368f, 4.104f)
                arcTo(2.001f, 2.001f, 0.0f, false, false, 2.0f, 15.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.738f, 0.404f, 1.376f, 1.0f, 1.723f)
                close()
                moveTo(5.5f, 18.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.001f, -3.001f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 5.5f, 18.0f)
                close()
                moveTo(18.5f, 18.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.001f, -3.001f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 18.5f, 18.0f)
                close()
                moveTo(7.441f, 9.0f)
                horizontalLineToRelative(9.117f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.949f, 0.684f)
                lineTo(18.613f, 13.0f)
                lineTo(5.387f, 13.0f)
                lineToRelative(1.105f, -3.316f)
                curveToRelative(0.137f, -0.409f, 0.519f, -0.684f, 0.949f, -0.684f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 7.388f)
                verticalLineTo(5.279f)
                lineToRelative(-9.684f, -3.228f)
                arcToRelative(0.996f, 0.996f, 0.0f, false, false, -0.658f, 0.009f)
                lineTo(2.0f, 5.572f)
                verticalLineTo(7.7f)
                lineToRelative(10.015f, -3.642f)
                lineTo(22.0f, 7.388f)
                close()
            }
        }
        .build()
        return _bxsCarGarage!!
    }

private var _bxsCarGarage: ImageVector? = null
