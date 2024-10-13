package com.woowla.compose.icon.collections.devicons.devicons.pytorch

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
import com.woowla.compose.icon.collections.devicons.devicons.PytorchGroup

public val PytorchGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFFEE4C2C)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(100.1f, 38.3f)
                lineToRelative(-9.2f, 9.2f)
                curveToRelative(15.1f, 15.1f, 15.1f, 39.4f, 0.0f, 54.3f)
                curveToRelative(-15.1f, 15.1f, -39.4f, 15.1f, -54.3f, 0.0f)
                curveToRelative(-15.1f, -15.1f, -15.1f, -39.4f, 0.0f, -54.3f)
                lineToRelative(24.0f, -24.0f)
                lineToRelative(3.4f, -3.4f)
                verticalLineTo(2.0f)
                lineTo(27.8f, 38.2f)
                curveTo(7.7f, 58.3f, 7.7f, 90.8f, 27.8f, 111.0f)
                reflectiveCurveToRelative(52.6f, 20.1f, 72.4f, 0.0f)
                curveToRelative(20.1f, -20.2f, 20.1f, -52.5f, -0.1f, -72.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFFEE4C2C)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(82.07f, 29.37f)
                moveToRelative(-0.12f, 6.7f)
                arcToRelative(6.7f, 6.7f, 46.06f, true, true, 0.25f, -13.4f)
                arcToRelative(6.7f, 6.7f, 46.06f, true, true, -0.25f, 13.4f)
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null
