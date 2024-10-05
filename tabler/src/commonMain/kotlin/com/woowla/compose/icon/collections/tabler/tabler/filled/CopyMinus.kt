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

public val FilledGroup.CopyMinus: ImageVector
    get() {
        if (_copyMinus != null) {
            return _copyMinus!!
        }
        _copyMinus = Builder(name = "CopyMinus", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(17.0f, 13.0f)
                horizontalLineToRelative(-6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                horizontalLineToRelative(6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
            }
        }
        .build()
        return _copyMinus!!
    }

private var _copyMinus: ImageVector? = null
