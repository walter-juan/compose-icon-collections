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

public val FilledGroup.Octagon: ImageVector
    get() {
        if (_octagon != null) {
            return _octagon!!
        }
        _octagon = Builder(name = "Octagon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.3f, 2.0f)
                horizontalLineToRelative(-6.6f)
                curveToRelative(-0.562f, 0.0f, -1.016f, 0.201f, -1.407f, 0.593f)
                lineToRelative(-4.7f, 4.7f)
                arcToRelative(1.894f, 1.894f, 0.0f, false, false, -0.593f, 1.407f)
                verticalLineToRelative(6.6f)
                curveToRelative(0.0f, 0.562f, 0.201f, 1.016f, 0.593f, 1.407f)
                lineToRelative(4.7f, 4.7f)
                curveToRelative(0.391f, 0.392f, 0.845f, 0.593f, 1.407f, 0.593f)
                horizontalLineToRelative(6.6f)
                curveToRelative(0.562f, 0.0f, 1.016f, -0.201f, 1.407f, -0.593f)
                lineToRelative(4.7f, -4.7f)
                curveToRelative(0.392f, -0.391f, 0.593f, -0.845f, 0.593f, -1.407f)
                verticalLineToRelative(-6.6f)
                curveToRelative(0.0f, -0.562f, -0.201f, -1.016f, -0.593f, -1.407f)
                lineToRelative(-4.7f, -4.7f)
                arcToRelative(1.894f, 1.894f, 0.0f, false, false, -1.407f, -0.593f)
                close()
            }
        }
        .build()
        return _octagon!!
    }

private var _octagon: ImageVector? = null
