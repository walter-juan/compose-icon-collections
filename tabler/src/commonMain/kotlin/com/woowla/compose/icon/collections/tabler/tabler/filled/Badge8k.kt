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

public val FilledGroup.Badge8k: ImageVector
    get() {
        if (_badge8k != null) {
            return _badge8k!!
        }
        _badge8k = Builder(name = "Badge8k", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 4.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, 3.0f)
                verticalLineToRelative(10.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, 3.0f)
                horizontalLineToRelative(-14.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, -3.0f)
                verticalLineToRelative(-10.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, -3.0f)
                close()
                moveTo(17.555f, 8.168f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.387f, 0.277f)
                lineToRelative(-1.168f, 1.751f)
                verticalLineToRelative(-1.196f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.883f, -0.993f)
                lineToRelative(-0.117f, -0.007f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                verticalLineToRelative(-1.196f)
                lineToRelative(1.168f, 1.75f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.286f, 0.337f)
                lineToRelative(0.1f, -0.059f)
                lineToRelative(0.094f, -0.07f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.184f, -1.317f)
                lineToRelative(-1.63f, -2.445f)
                lineToRelative(1.63f, -2.445f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.277f, -1.387f)
                moveToRelative(-8.555f, -0.168f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(1.0f)
                lineToRelative(0.005f, 0.15f)
                curveToRelative(0.022f, 0.295f, 0.108f, 0.573f, 0.245f, 0.819f)
                lineToRelative(0.019f, 0.031f)
                lineToRelative(-0.02f, 0.031f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -0.249f, 0.969f)
                verticalLineToRelative(1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                verticalLineToRelative(-1.0f)
                lineToRelative(-0.005f, -0.15f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -0.245f, -0.819f)
                lineToRelative(-0.019f, -0.031f)
                lineToRelative(0.02f, -0.031f)
                curveToRelative(0.158f, -0.287f, 0.249f, -0.618f, 0.249f, -0.969f)
                verticalLineToRelative(-1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                moveToRelative(0.0f, 5.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(9.0f, 10.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-1.0f)
                close()
            }
        }
        .build()
        return _badge8k!!
    }

private var _badge8k: ImageVector? = null
