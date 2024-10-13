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

public val RegularGroup.BxCollapseHorizontal: ImageVector
    get() {
        if (_bxCollapseHorizontal != null) {
            return _bxCollapseHorizontal!!
        }
        _bxCollapseHorizontal = Builder(name = "BxCollapseHorizontal", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.95f, 5.64f)
                lineTo(13.59f, 12.0f)
                lineToRelative(6.36f, 6.36f)
                lineToRelative(1.41f, -1.41f)
                lineTo(16.41f, 12.0f)
                lineToRelative(4.95f, -4.95f)
                lineToRelative(-1.41f, -1.41f)
                close()
                moveTo(2.64f, 7.05f)
                lineTo(7.59f, 12.0f)
                lineToRelative(-4.95f, 4.95f)
                lineToRelative(1.41f, 1.41f)
                lineTo(10.41f, 12.0f)
                lineTo(4.05f, 5.64f)
                lineTo(2.64f, 7.05f)
                close()
            }
        }
        .build()
        return _bxCollapseHorizontal!!
    }

private var _bxCollapseHorizontal: ImageVector? = null
