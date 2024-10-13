package com.woowla.compose.icon.collections.boxicons.boxicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.RegularGroup

public val RegularGroup.BxShareAlt: ImageVector
    get() {
        if (_bxShareAlt != null) {
            return _bxShareAlt!!
        }
        _bxShareAlt = Builder(name = "BxShareAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.5f, 15.0f)
                arcToRelative(3.51f, 3.51f, 0.0f, false, false, 2.36f, -0.93f)
                lineToRelative(6.26f, 3.58f)
                arcToRelative(3.06f, 3.06f, 0.0f, false, false, -0.12f, 0.85f)
                arcToRelative(3.53f, 3.53f, 0.0f, true, false, 1.14f, -2.57f)
                lineToRelative(-6.26f, -3.58f)
                arcToRelative(2.74f, 2.74f, 0.0f, false, false, 0.12f, -0.76f)
                lineToRelative(6.15f, -3.52f)
                arcTo(3.49f, 3.49f, 0.0f, true, false, 14.0f, 5.5f)
                arcToRelative(3.35f, 3.35f, 0.0f, false, false, 0.12f, 0.85f)
                lineTo(8.43f, 9.6f)
                arcTo(3.5f, 3.5f, 0.0f, true, false, 5.5f, 15.0f)
                close()
                moveTo(17.5f, 17.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -1.5f, 1.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 1.5f, -1.5f)
                close()
                moveTo(17.5f, 4.0f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 16.0f, 5.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 17.5f, 4.0f)
                close()
                moveTo(5.5f, 10.0f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 4.0f, 11.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 5.5f, 10.0f)
                close()
            }
        }
        .build()
        return _bxShareAlt!!
    }

private var _bxShareAlt: ImageVector? = null
