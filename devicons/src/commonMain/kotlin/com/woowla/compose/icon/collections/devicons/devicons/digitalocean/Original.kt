package com.woowla.compose.icon.collections.devicons.devicons.digitalocean

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.DigitaloceanGroup

public val DigitaloceanGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF0080ff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.14f, 102.96f)
                lineTo(39.24f, 102.96f)
                lineTo(39.24f, 78.52f)
                horizontalLineToRelative(24.9f)
                close()
                moveTo(39.24f, 122.13f)
                lineTo(20.37f, 122.13f)
                verticalLineToRelative(-19.17f)
                horizontalLineToRelative(18.87f)
                close()
                moveTo(20.37f, 102.96f)
                lineTo(4.53f, 102.96f)
                verticalLineToRelative(-15.79f)
                horizontalLineToRelative(15.84f)
                close()
                moveTo(63.77f, 127.77f)
                verticalLineToRelative(-24.81f)
                curveToRelative(26.41f, 0.0f, 46.78f, -25.94f, 36.6f, -53.39f)
                curveToRelative(-3.77f, -10.15f, -11.69f, -18.42f, -22.26f, -22.18f)
                curveToRelative(-27.17f, -9.77f, -53.2f, 10.53f, -53.2f, 36.47f)
                lineTo(0.0f, 63.86f)
                curveTo(0.0f, 22.5f, 40.37f, -10.21f, 84.52f, 3.33f)
                curveToRelative(19.24f, 6.02f, 34.33f, 21.05f, 40.37f, 40.23f)
                curveToRelative(13.58f, 43.99f, -19.25f, 84.21f, -61.12f, 84.21f)
                close()
                moveTo(63.77f, 127.77f)
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null
