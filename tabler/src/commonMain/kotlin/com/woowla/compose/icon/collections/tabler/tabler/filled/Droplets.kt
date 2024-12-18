package com.woowla.compose.icon.collections.tabler.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.tabler.tabler.FilledGroup

public val FilledGroup.Droplets: ImageVector
    get() {
        if (_droplets != null) {
            return _droplets!!
        }
        _droplets = Builder(name = "Droplets", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 12.003f)
                curveToRelative(0.541f, 0.0f, 1.045f, 0.273f, 1.342f, 0.727f)
                lineToRelative(2.122f, 3.273f)
                arcToRelative(3.999f, 3.999f, 0.0f, false, true, -6.035f, 5.063f)
                curveToRelative(-1.487f, -1.248f, -1.864f, -3.382f, -0.867f, -5.11f)
                lineToRelative(2.098f, -3.226f)
                arcToRelative(1.6f, 1.6f, 0.0f, false, true, 1.34f, -0.727f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 12.003f)
                curveToRelative(0.541f, 0.0f, 1.045f, 0.273f, 1.342f, 0.727f)
                lineToRelative(2.122f, 3.273f)
                arcToRelative(3.999f, 3.999f, 0.0f, false, true, -6.035f, 5.063f)
                curveToRelative(-1.487f, -1.248f, -1.864f, -3.382f, -0.867f, -5.11f)
                lineToRelative(2.098f, -3.227f)
                arcToRelative(1.6f, 1.6f, 0.0f, false, true, 1.34f, -0.726f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.003f)
                curveToRelative(0.541f, 0.0f, 1.045f, 0.273f, 1.342f, 0.727f)
                lineToRelative(2.122f, 3.273f)
                arcToRelative(3.999f, 3.999f, 0.0f, false, true, -6.035f, 5.063f)
                curveToRelative(-1.487f, -1.248f, -1.864f, -3.382f, -0.867f, -5.11f)
                lineToRelative(2.098f, -3.226f)
                arcToRelative(1.6f, 1.6f, 0.0f, false, true, 1.34f, -0.727f)
            }
        }
        .build()
        return _droplets!!
    }

private var _droplets: ImageVector? = null
