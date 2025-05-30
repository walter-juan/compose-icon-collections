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

public val RegularGroup.BxExpandHorizontal: ImageVector
    get() {
        if (_bxExpandHorizontal != null) {
            return _bxExpandHorizontal!!
        }
        _bxExpandHorizontal = Builder(name = "BxExpandHorizontal", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.29f, 5.64f)
                lineTo(1.93f, 12.0f)
                lineToRelative(6.36f, 6.36f)
                lineToRelative(1.42f, -1.41f)
                lineTo(4.76f, 12.0f)
                lineToRelative(4.95f, -4.95f)
                lineToRelative(-1.42f, -1.41f)
                close()
                moveTo(14.29f, 7.05f)
                lineTo(19.24f, 12.0f)
                lineToRelative(-4.95f, 4.95f)
                lineToRelative(1.42f, 1.41f)
                lineTo(22.07f, 12.0f)
                lineToRelative(-6.36f, -6.36f)
                lineToRelative(-1.42f, 1.41f)
                close()
            }
        }
        .build()
        return _bxExpandHorizontal!!
    }

private var _bxExpandHorizontal: ImageVector? = null
