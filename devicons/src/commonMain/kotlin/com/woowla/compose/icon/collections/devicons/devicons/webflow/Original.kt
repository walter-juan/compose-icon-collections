package com.woowla.compose.icon.collections.devicons.devicons.webflow

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.WebflowGroup

public val WebflowGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF4353ff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.99f, 0.99f)
                verticalLineToRelative(126.01f)
                horizontalLineToRelative(126.01f)
                lineTo(127.01f, 0.99f)
                lineTo(0.99f, 0.99f)
                close()
                moveTo(72.91f, 42.71f)
                reflectiveCurveToRelative(3.99f, 30.06f, 3.99f, 31.44f)
                lineToRelative(5.78f, -18.12f)
                horizontalLineToRelative(-0.04f)
                curveToRelative(2.55f, -6.86f, 7.58f, -13.32f, 17.15f, -13.32f)
                lineToRelative(-13.56f, 32.75f)
                arcToRelative(18.43f, 18.32f, 0.0f, false, true, -17.55f, 12.81f)
                reflectiveCurveToRelative(-3.99f, -28.15f, -3.99f, -28.79f)
                lineToRelative(-5.98f, 15.47f)
                curveToRelative(-2.67f, 6.86f, -7.86f, 13.32f, -17.43f, 13.32f)
                lineToRelative(-7.5f, -45.52f)
                arcToRelative(14.92f, 14.83f, 0.0f, false, true, 14.48f, 13.44f)
                reflectiveCurveToRelative(1.0f, 16.69f, 1.0f, 18.0f)
                lineToRelative(7.06f, -18.16f)
                curveToRelative(2.55f, -6.86f, 7.42f, -13.32f, 16.59f, -13.32f)
                close()
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null
