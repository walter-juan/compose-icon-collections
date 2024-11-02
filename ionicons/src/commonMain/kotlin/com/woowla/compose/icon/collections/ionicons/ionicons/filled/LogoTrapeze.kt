package com.woowla.compose.icon.collections.ionicons.ionicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.ionicons.ionicons.FilledGroup

public val FilledGroup.LogoTrapeze: ImageVector
    get() {
        if (_logoTrapeze != null) {
            return _logoTrapeze!!
        }
        _logoTrapeze = Builder(name = "LogoTrapeze", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(311.05f, 189.26f)
                curveTo(311.07f, 189.23f, 311.09f, 189.2f, 311.11f, 189.17f)
                lineTo(376.08f, 78.55f)
                lineTo(257.92f, 8.0f)
                lineTo(192.94f, 118.62f)
                curveTo(192.91f, 118.67f, 192.88f, 118.73f, 192.85f, 118.78f)
                lineTo(8.0f, 433.45f)
                lineTo(126.16f, 504.0f)
                lineTo(212.11f, 357.69f)
                curveTo(226.72f, 375.31f, 244.5f, 390.76f, 265.22f, 403.13f)
                lineTo(434.02f, 503.92f)
                lineTo(504.0f, 384.79f)
                lineTo(335.2f, 284.0f)
                curveTo(302.6f, 264.54f, 291.8f, 222.14f, 311.05f, 189.26f)
                close()
            }
        }
        .build()
        return _logoTrapeze!!
    }

private var _logoTrapeze: ImageVector? = null
