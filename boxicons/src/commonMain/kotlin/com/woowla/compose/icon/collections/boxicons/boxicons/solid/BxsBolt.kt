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

public val SolidGroup.BxsBolt: ImageVector
    get() {
        if (_bxsBolt != null) {
            return _bxsBolt!!
        }
        _bxsBolt = Builder(name = "BxsBolt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.168f, 8.0f)
                horizontalLineTo(13.0f)
                lineToRelative(0.806f, -4.835f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 12.819f, 2.0f)
                horizontalLineTo(7.667f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.986f, 0.835f)
                lineToRelative(-1.667f, 10.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 6.0f, 14.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(8.0f)
                lineToRelative(8.01f, -12.459f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 17.168f, 8.0f)
                close()
            }
        }
        .build()
        return _bxsBolt!!
    }

private var _bxsBolt: ImageVector? = null
