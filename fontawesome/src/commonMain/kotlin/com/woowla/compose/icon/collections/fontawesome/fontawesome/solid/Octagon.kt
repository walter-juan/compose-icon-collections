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

public val SolidGroup.Octagon: ImageVector
    get() {
        if (_octagon != null) {
            return _octagon!!
        }
        _octagon = Builder(name = "Octagon", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(188.6f, 0.1f)
                curveToRelative(-17.0f, 0.0f, -33.3f, 6.7f, -45.3f, 18.7f)
                lineTo(19.2f, 143.0f)
                curveTo(7.2f, 155.0f, 0.5f, 171.2f, 0.5f, 188.2f)
                lineToRelative(0.0f, 135.6f)
                curveToRelative(0.0f, 17.0f, 6.7f, 33.3f, 18.7f, 45.3f)
                lineTo(143.4f, 493.2f)
                curveToRelative(12.0f, 12.0f, 28.3f, 18.7f, 45.3f, 18.7f)
                lineToRelative(135.6f, 0.0f)
                curveToRelative(17.0f, 0.0f, 33.3f, -6.7f, 45.3f, -18.7f)
                lineTo(493.6f, 369.0f)
                curveToRelative(12.0f, -12.0f, 18.7f, -28.3f, 18.7f, -45.3f)
                lineToRelative(0.0f, -135.6f)
                curveToRelative(0.0f, -17.0f, -6.7f, -33.3f, -18.7f, -45.3f)
                lineTo(369.5f, 18.8f)
                curveToRelative(-12.0f, -12.0f, -28.3f, -18.7f, -45.3f, -18.7f)
                lineTo(188.6f, 0.1f)
                close()
            }
        }
        .build()
        return _octagon!!
    }

private var _octagon: ImageVector? = null
