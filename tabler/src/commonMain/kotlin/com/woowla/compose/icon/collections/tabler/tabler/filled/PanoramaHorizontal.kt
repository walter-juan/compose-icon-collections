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

public val FilledGroup.PanoramaHorizontal: ImageVector
    get() {
        if (_panoramaHorizontal != null) {
            return _panoramaHorizontal!!
        }
        _panoramaHorizontal = Builder(name = "PanoramaHorizontal", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.31f, 4.591f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.69f, 1.873f)
                verticalLineToRelative(11.0f)
                curveToRelative(0.0f, 1.382f, -1.38f, 2.38f, -2.694f, 1.897f)
                curveToRelative(-4.879f, -1.845f, -9.734f, -1.845f, -14.612f, 0.0f)
                curveToRelative(-1.304f, 0.495f, -2.694f, -0.481f, -2.694f, -1.871f)
                verticalLineToRelative(-11.032f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.676f, -1.87f)
                lineToRelative(0.025f, 0.012f)
                lineToRelative(0.448f, 0.162f)
                curveToRelative(4.572f, 1.623f, 9.123f, 1.622f, 13.703f, -0.003f)
                close()
            }
        }
        .build()
        return _panoramaHorizontal!!
    }

private var _panoramaHorizontal: ImageVector? = null
