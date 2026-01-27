package com.woowla.compose.icon.collections.tabler.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.tabler.tabler.FilledGroup

public val FilledGroup.Crown: ImageVector
    get() {
        if (_crown != null) {
            return _crown!!
        }
        _crown = Builder(name = "Crown", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 19.0f)
                horizontalLineToRelative(-14.0f)
                curveToRelative(-0.5f, 0.0f, -0.9f, -0.3f, -1.0f, -0.8f)
                lineToRelative(-2.0f, -10.0f)
                curveToRelative(0.0f, -0.4f, 0.1f, -0.8f, 0.5f, -1.1f)
                curveToRelative(0.4f, -0.2f, 0.8f, -0.2f, 1.1f, 0.0f)
                lineToRelative(4.1f, 3.3f)
                lineToRelative(3.4f, -5.1f)
                curveToRelative(0.4f, -0.6f, 1.3f, -0.6f, 1.7f, 0.0f)
                lineToRelative(3.4f, 5.1f)
                lineToRelative(4.1f, -3.3f)
                curveToRelative(0.3f, -0.3f, 0.8f, -0.3f, 1.1f, 0.0f)
                curveToRelative(0.4f, 0.2f, 0.5f, 0.6f, 0.5f, 1.1f)
                lineToRelative(-2.0f, 10.0f)
                curveToRelative(0.0f, 0.5f, -0.5f, 0.8f, -1.0f, 0.8f)
                close()
            }
        }
        .build()
        return _crown!!
    }

private var _crown: ImageVector? = null
