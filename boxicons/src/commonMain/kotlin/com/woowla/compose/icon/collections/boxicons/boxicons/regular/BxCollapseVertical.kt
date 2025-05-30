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

public val RegularGroup.BxCollapseVertical: ImageVector
    get() {
        if (_bxCollapseVertical != null) {
            return _bxCollapseVertical!!
        }
        _bxCollapseVertical = Builder(name = "BxCollapseVertical", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 7.59f)
                lineTo(7.05f, 2.64f)
                lineTo(5.64f, 4.05f)
                lineTo(12.0f, 10.41f)
                lineToRelative(6.36f, -6.36f)
                lineToRelative(-1.41f, -1.41f)
                lineTo(12.0f, 7.59f)
                close()
                moveTo(5.64f, 19.95f)
                lineToRelative(1.41f, 1.41f)
                lineTo(12.0f, 16.41f)
                lineToRelative(4.95f, 4.95f)
                lineToRelative(1.41f, -1.41f)
                lineTo(12.0f, 13.59f)
                lineToRelative(-6.36f, 6.36f)
                close()
            }
        }
        .build()
        return _bxCollapseVertical!!
    }

private var _bxCollapseVertical: ImageVector? = null
