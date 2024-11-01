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

public val FilledGroup.BrandSketch: ImageVector
    get() {
        if (_brandSketch != null) {
            return _brandSketch!!
        }
        _brandSketch = Builder(name = "BrandSketch", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.554f, 3.004f)
                horizontalLineToRelative(8.929f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.647f, 0.873f)
                lineToRelative(3.536f, 5.193f)
                arcToRelative(2.006f, 2.006f, 0.0f, false, true, -0.173f, 2.48f)
                lineToRelative(-8.0f, 8.79f)
                arcToRelative(2.007f, 2.007f, 0.0f, false, true, -2.97f, 0.0f)
                lineToRelative(-8.0f, -8.789f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.13f, -0.175f)
                lineToRelative(-0.012f, -0.026f)
                lineToRelative(-0.051f, -0.072f)
                arcToRelative(2.01f, 2.01f, 0.0f, false, true, -0.056f, -2.063f)
                lineToRelative(0.09f, -0.146f)
                lineToRelative(3.541f, -5.193f)
                curveToRelative(0.372f, -0.544f, 0.987f, -0.87f, 1.649f, -0.872f)
            }
        }
        .build()
        return _brandSketch!!
    }

private var _brandSketch: ImageVector? = null
