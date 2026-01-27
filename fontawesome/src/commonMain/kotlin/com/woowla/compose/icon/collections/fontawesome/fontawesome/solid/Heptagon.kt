package com.woowla.compose.icon.collections.fontawesome.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.fontawesome.fontawesome.SolidGroup

public val SolidGroup.Heptagon: ImageVector
    get() {
        if (_heptagon != null) {
            return _heptagon!!
        }
        _heptagon = Builder(name = "Heptagon", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(267.4f, -31.5f)
                curveToRelative(15.9f, -5.5f, 33.5f, -4.6f, 48.8f, 2.7f)
                lineToRelative(172.4f, 83.0f)
                lineToRelative(6.3f, 3.5f)
                curveToRelative(14.2f, 9.0f, 24.5f, 23.3f, 28.3f, 39.9f)
                lineToRelative(42.6f, 186.5f)
                lineToRelative(1.2f, 7.2f)
                curveToRelative(1.6f, 14.3f, -1.7f, 28.8f, -9.4f, 41.1f)
                lineToRelative(-4.2f, 5.9f)
                lineToRelative(-119.3f, 149.6f)
                curveToRelative(-12.1f, 15.2f, -30.6f, 24.1f, -50.0f, 24.1f)
                lineToRelative(-191.3f, 0.0f)
                curveToRelative(-19.5f, 0.0f, -37.9f, -8.9f, -50.0f, -24.1f)
                lineTo(23.5f, 338.4f)
                curveToRelative(-12.1f, -15.2f, -16.7f, -35.2f, -12.3f, -54.2f)
                lineToRelative(42.6f, -186.5f)
                lineToRelative(2.0f, -7.0f)
                curveToRelative(5.6f, -15.9f, 17.2f, -29.0f, 32.6f, -36.4f)
                lineToRelative(172.4f, -83.0f)
                lineToRelative(6.7f, -2.7f)
                close()
            }
        }
        .build()
        return _heptagon!!
    }

private var _heptagon: ImageVector? = null
