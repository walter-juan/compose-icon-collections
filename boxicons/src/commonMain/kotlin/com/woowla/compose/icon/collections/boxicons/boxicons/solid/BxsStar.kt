package com.woowla.compose.icon.collections.boxicons.boxicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.SolidGroup

public val SolidGroup.BxsStar: ImageVector
    get() {
        if (_bxsStar != null) {
            return _bxsStar!!
        }
        _bxsStar = Builder(name = "BxsStar", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.947f, 9.179f)
                arcToRelative(1.001f, 1.001f, 0.0f, false, false, -0.868f, -0.676f)
                lineToRelative(-5.701f, -0.453f)
                lineToRelative(-2.467f, -5.461f)
                arcToRelative(0.998f, 0.998f, 0.0f, false, false, -1.822f, -0.001f)
                lineTo(8.622f, 8.05f)
                lineToRelative(-5.701f, 0.453f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.619f, 1.713f)
                lineToRelative(4.213f, 4.107f)
                lineToRelative(-1.49f, 6.452f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.53f, 1.057f)
                lineTo(12.0f, 18.202f)
                lineToRelative(5.445f, 3.63f)
                arcToRelative(1.001f, 1.001f, 0.0f, false, false, 1.517f, -1.106f)
                lineToRelative(-1.829f, -6.4f)
                lineToRelative(4.536f, -4.082f)
                curveToRelative(0.297f, -0.268f, 0.406f, -0.686f, 0.278f, -1.065f)
                close()
            }
        }
        .build()
        return _bxsStar!!
    }

private var _bxsStar: ImageVector? = null
