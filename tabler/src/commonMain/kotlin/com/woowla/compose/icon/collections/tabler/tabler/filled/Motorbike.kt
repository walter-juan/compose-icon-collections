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

public val FilledGroup.Motorbike: ImageVector
    get() {
        if (_motorbike != null) {
            return _motorbike!!
        }
        _motorbike = Builder(name = "Motorbike", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.894f, 0.553f)
                lineToRelative(3.225f, 6.449f)
                lineToRelative(0.08f, 0.003f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -4.199f, 3.995f)
                lineToRelative(0.005f, -0.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.111f, -3.33f)
                lineToRelative(-0.557f, -1.115f)
                lineToRelative(-3.352f, 3.352f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.707f, 0.293f)
                horizontalLineToRelative(-3.626f)
                quadToRelative(0.124f, 0.481f, 0.126f, 1.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -8.0f, 0.0f)
                lineToRelative(0.005f, -0.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 6.33f, -3.049f)
                lineToRelative(1.749f, -1.751f)
                horizontalLineToRelative(-3.084f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.993f, -0.883f)
                lineToRelative(-0.007f, -0.117f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(9.381f)
                lineToRelative(-1.0f, -2.0f)
                horizontalLineToRelative(-1.381f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.993f, -0.883f)
                lineToRelative(-0.007f, -0.117f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _motorbike!!
    }

private var _motorbike: ImageVector? = null
