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

public val FilledGroup.CopyX: ImageVector
    get() {
        if (_copyX != null) {
            return _copyX!!
        }
        _copyX = Builder(name = "CopyX", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.333f, 6.0f)
                arcToRelative(3.667f, 3.667f, 0.0f, false, true, 3.667f, 3.667f)
                verticalLineToRelative(8.666f)
                arcToRelative(3.667f, 3.667f, 0.0f, false, true, -3.667f, 3.667f)
                horizontalLineToRelative(-8.666f)
                arcToRelative(3.667f, 3.667f, 0.0f, false, true, -3.667f, -3.667f)
                verticalLineToRelative(-8.666f)
                arcToRelative(3.667f, 3.667f, 0.0f, false, true, 3.667f, -3.667f)
                close()
                moveTo(15.0f, 2.0f)
                curveToRelative(1.094f, 0.0f, 1.828f, 0.533f, 2.374f, 1.514f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.748f, 0.972f)
                curveToRelative(-0.221f, -0.398f, -0.342f, -0.486f, -0.626f, -0.486f)
                horizontalLineToRelative(-10.0f)
                curveToRelative(-0.548f, 0.0f, -1.0f, 0.452f, -1.0f, 1.0f)
                verticalLineToRelative(9.998f)
                curveToRelative(0.0f, 0.32f, 0.154f, 0.618f, 0.407f, 0.805f)
                lineToRelative(0.1f, 0.065f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -0.99f, 1.738f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -1.517f, -2.606f)
                verticalLineToRelative(-10.0f)
                curveToRelative(0.0f, -1.652f, 1.348f, -3.0f, 3.0f, -3.0f)
                close()
                moveTo(15.8f, 10.786f)
                lineToRelative(-1.837f, 1.799f)
                lineToRelative(-1.749f, -1.785f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.319f, -0.096f)
                lineToRelative(-0.095f, 0.082f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.014f, 1.414f)
                lineToRelative(1.749f, 1.785f)
                lineToRelative(-1.835f, 1.8f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.096f, 1.32f)
                lineToRelative(0.082f, 0.095f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.414f, 0.014f)
                lineToRelative(1.836f, -1.8f)
                lineToRelative(1.75f, 1.786f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.319f, 0.096f)
                lineToRelative(0.095f, -0.082f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.014f, -1.414f)
                lineToRelative(-1.75f, -1.786f)
                lineToRelative(1.836f, -1.8f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.096f, -1.319f)
                lineToRelative(-0.082f, -0.095f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.414f, -0.014f)
            }
        }
        .build()
        return _copyX!!
    }

private var _copyX: ImageVector? = null
