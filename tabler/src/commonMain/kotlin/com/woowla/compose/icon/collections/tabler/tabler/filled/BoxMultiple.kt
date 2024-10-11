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

public val FilledGroup.BoxMultiple: ImageVector
    get() {
        if (_boxMultiple != null) {
            return _boxMultiple!!
        }
        _boxMultiple = Builder(name = "BoxMultiple", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 5.667f)
                arcToRelative(3.667f, 3.667f, 0.0f, false, true, 3.667f, -3.667f)
                horizontalLineToRelative(8.666f)
                arcToRelative(3.667f, 3.667f, 0.0f, false, true, 3.667f, 3.667f)
                verticalLineToRelative(8.666f)
                arcToRelative(3.667f, 3.667f, 0.0f, false, true, -3.667f, 3.667f)
                horizontalLineToRelative(-8.666f)
                arcToRelative(3.667f, 3.667f, 0.0f, false, true, -3.667f, -3.667f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 9.0f)
                curveToRelative(0.0f, -1.094f, 0.533f, -1.828f, 1.514f, -2.374f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.972f, 1.748f)
                curveToRelative(-0.398f, 0.221f, -0.486f, 0.342f, -0.486f, 0.626f)
                verticalLineToRelative(10.0f)
                curveToRelative(0.0f, 0.548f, 0.452f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(9.998f)
                curveToRelative(0.32f, 0.0f, 0.618f, -0.154f, 0.805f, -0.407f)
                lineToRelative(0.065f, -0.1f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.738f, 0.99f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -2.606f, 1.517f)
                horizontalLineToRelative(-10.0f)
                curveToRelative(-1.652f, 0.0f, -3.0f, -1.348f, -3.0f, -3.0f)
                close()
            }
        }
        .build()
        return _boxMultiple!!
    }

private var _boxMultiple: ImageVector? = null
