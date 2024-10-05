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

public val FilledGroup.BinaryTree: ImageVector
    get() {
        if (_binaryTree != null) {
            return _binaryTree!!
        }
        _binaryTree = Builder(name = "BinaryTree", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 1.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 2.348f, 4.868f)
                lineToRelative(2.0f, 3.203f)
                quadToRelative(0.317f, -0.071f, 0.652f, -0.071f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, -2.347f, 1.132f)
                lineToRelative(-2.0f, -3.203f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -1.304f, 0.0f)
                lineToRelative(-2.001f, 3.203f)
                curveToRelative(0.408f, 0.513f, 0.652f, 1.162f, 0.652f, 1.868f)
                reflectiveCurveToRelative(-0.244f, 1.356f, -0.653f, 1.868f)
                lineToRelative(2.002f, 3.203f)
                quadToRelative(0.315f, -0.071f, 0.651f, -0.071f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, -2.347f, 1.132f)
                lineToRelative(-2.003f, -3.203f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -1.302f, 0.0f)
                lineToRelative(-2.002f, 3.203f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, -1.696f, -1.06f)
                lineToRelative(2.002f, -3.204f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 2.998f, -4.798f)
                lineToRelative(2.002f, -3.202f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 2.348f, -4.868f)
            }
        }
        .build()
        return _binaryTree!!
    }

private var _binaryTree: ImageVector? = null
