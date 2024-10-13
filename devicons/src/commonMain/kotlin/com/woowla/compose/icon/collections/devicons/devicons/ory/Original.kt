package com.woowla.compose.icon.collections.devicons.devicons.ory

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.OryGroup

public val OryGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF5528ff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.16f, 0.07f)
                arcToRelative(0.58f, 0.58f, 0.0f, false, false, -0.26f, 0.06f)
                lineTo(33.75f, 15.04f)
                arcToRelative(0.26f, 0.26f, 0.0f, false, false, -0.15f, 0.25f)
                verticalLineToRelative(12.77f)
                curveToRelative(-0.0f, 0.04f, 0.01f, 0.07f, 0.05f, 0.09f)
                curveToRelative(0.03f, 0.02f, 0.07f, 0.02f, 0.1f, 0.01f)
                lineToRelative(30.23f, -14.98f)
                arcToRelative(0.34f, 0.34f, 0.0f, false, true, 0.31f, 0.0f)
                lineToRelative(30.15f, 14.94f)
                curveToRelative(0.11f, 0.05f, 0.16f, 0.02f, 0.16f, -0.1f)
                curveToRelative(0.06f, -4.07f, 0.07f, -8.15f, 0.02f, -12.23f)
                curveToRelative(-0.01f, -0.36f, 0.32f, -0.53f, -0.25f, -0.8f)
                curveToRelative(-10.02f, -4.96f, -20.0f, -9.91f, -29.96f, -14.84f)
                arcToRelative(0.58f, 0.58f, 0.0f, false, false, -0.26f, -0.06f)
                close()
                moveTo(64.15f, 33.47f)
                curveTo(47.28f, 33.47f, 33.61f, 47.14f, 33.61f, 64.0f)
                reflectiveCurveToRelative(13.67f, 30.53f, 30.53f, 30.53f)
                curveToRelative(16.86f, 0.0f, 30.53f, -13.67f, 30.53f, -30.53f)
                reflectiveCurveToRelative(-13.67f, -30.53f, -30.53f, -30.53f)
                close()
                moveTo(33.74f, 99.86f)
                curveToRelative(-0.03f, -0.01f, -0.07f, -0.01f, -0.09f, 0.0f)
                arcToRelative(0.1f, 0.1f, 0.0f, false, false, -0.05f, 0.09f)
                verticalLineToRelative(12.86f)
                curveToRelative(-0.0f, 0.04f, 0.02f, 0.07f, 0.05f, 0.09f)
                lineToRelative(30.43f, 15.09f)
                arcToRelative(0.09f, 0.09f, 0.0f, false, false, 0.09f, 0.0f)
                lineToRelative(30.41f, -15.05f)
                arcToRelative(0.1f, 0.1f, 0.0f, false, false, 0.05f, -0.09f)
                lineToRelative(0.01f, -12.88f)
                arcToRelative(0.1f, 0.1f, 0.0f, false, false, -0.05f, -0.09f)
                arcToRelative(0.1f, 0.1f, 0.0f, false, false, -0.1f, -0.0f)
                lineToRelative(-30.31f, 15.0f)
                arcToRelative(0.09f, 0.09f, 0.0f, false, true, -0.09f, 0.0f)
                lineTo(33.74f, 99.86f)
                close()
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null
