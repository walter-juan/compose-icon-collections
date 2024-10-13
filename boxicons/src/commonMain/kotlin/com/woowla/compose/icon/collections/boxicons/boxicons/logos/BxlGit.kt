package com.woowla.compose.icon.collections.boxicons.boxicons.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.LogosGroup

public val LogosGroup.BxlGit: ImageVector
    get() {
        if (_bxlGit != null) {
            return _bxlGit!!
        }
        _bxlGit = Builder(name = "BxlGit", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.62f, 11.108f)
                lineToRelative(-8.731f, -8.729f)
                arcToRelative(1.292f, 1.292f, 0.0f, false, false, -1.823f, 0.0f)
                lineTo(9.257f, 4.19f)
                lineToRelative(2.299f, 2.3f)
                arcToRelative(1.532f, 1.532f, 0.0f, false, true, 1.939f, 1.95f)
                lineToRelative(2.214f, 2.217f)
                arcToRelative(1.53f, 1.53f, 0.0f, false, true, 1.583f, 2.531f)
                curveToRelative(-0.599f, 0.6f, -1.566f, 0.6f, -2.166f, 0.0f)
                arcToRelative(1.536f, 1.536f, 0.0f, false, true, -0.337f, -1.662f)
                lineToRelative(-2.074f, -2.063f)
                verticalLineTo(14.9f)
                curveToRelative(0.146f, 0.071f, 0.286f, 0.169f, 0.407f, 0.29f)
                arcToRelative(1.537f, 1.537f, 0.0f, false, true, 0.0f, 2.166f)
                arcToRelative(1.536f, 1.536f, 0.0f, false, true, -2.174f, 0.0f)
                arcToRelative(1.528f, 1.528f, 0.0f, false, true, 0.0f, -2.164f)
                curveToRelative(0.152f, -0.15f, 0.322f, -0.264f, 0.504f, -0.339f)
                verticalLineToRelative(-5.49f)
                arcToRelative(1.529f, 1.529f, 0.0f, false, true, -0.83f, -2.008f)
                lineToRelative(-2.26f, -2.271f)
                lineToRelative(-5.987f, 5.982f)
                curveToRelative(-0.5f, 0.504f, -0.5f, 1.32f, 0.0f, 1.824f)
                lineToRelative(8.731f, 8.729f)
                arcToRelative(1.286f, 1.286f, 0.0f, false, false, 1.821f, 0.0f)
                lineToRelative(8.69f, -8.689f)
                arcToRelative(1.284f, 1.284f, 0.0f, false, false, 0.003f, -1.822f)
            }
        }
        .build()
        return _bxlGit!!
    }

private var _bxlGit: ImageVector? = null
