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

public val FilledGroup.PanoramaVertical: ImageVector
    get() {
        if (_panoramaVertical != null) {
            return _panoramaVertical!!
        }
        _panoramaVertical = Builder(name = "PanoramaVertical", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.53f, 2.0f)
                curveToRelative(1.39f, 0.0f, 2.364f, 1.389f, 1.87f, 2.692f)
                lineToRelative(-0.013f, 0.026f)
                lineToRelative(-0.156f, 0.431f)
                curveToRelative(-1.623f, 4.572f, -1.622f, 9.123f, 0.003f, 13.703f)
                lineToRelative(0.168f, 0.458f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.873f, 2.69f)
                horizontalLineToRelative(-11.0f)
                curveToRelative(-1.386f, 0.0f, -2.394f, -1.386f, -1.897f, -2.694f)
                curveToRelative(1.845f, -4.879f, 1.845f, -9.734f, 0.0f, -14.612f)
                curveToRelative(-0.495f, -1.304f, 0.48f, -2.694f, 1.87f, -2.694f)
                close()
            }
        }
        .build()
        return _panoramaVertical!!
    }

private var _panoramaVertical: ImageVector? = null
