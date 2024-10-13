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

public val SolidGroup.BxsRadio: ImageVector
    get() {
        if (_bxsRadio != null) {
            return _bxsRadio!!
        }
        _bxsRadio = Builder(name = "BxsRadio", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.249f, 5.025f)
                lineToRelative(-7.897f, -2.962f)
                lineToRelative(-0.703f, 1.873f)
                lineTo(14.484f, 5.0f)
                lineTo(4.0f, 5.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                lineTo(22.0f, 7.0f)
                curveToRelative(0.0f, -1.02f, -0.766f, -1.851f, -1.751f, -1.975f)
                close()
                moveTo(10.0f, 17.0f)
                lineTo(6.0f, 17.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(16.5f, 18.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 0.0f, -5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 0.0f, 5.0f)
                close()
                moveTo(20.0f, 11.0f)
                lineTo(4.0f, 11.0f)
                lineTo(4.0f, 7.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(4.0f)
                close()
            }
        }
        .build()
        return _bxsRadio!!
    }

private var _bxsRadio: ImageVector? = null
