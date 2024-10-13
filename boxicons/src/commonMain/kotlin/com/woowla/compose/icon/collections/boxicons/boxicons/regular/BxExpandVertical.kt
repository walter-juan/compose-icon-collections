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

public val RegularGroup.BxExpandVertical: ImageVector
    get() {
        if (_bxExpandVertical != null) {
            return _bxExpandVertical!!
        }
        _bxExpandVertical = Builder(name = "BxExpandVertical", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 19.24f)
                lineToRelative(-4.95f, -4.95f)
                lineToRelative(-1.41f, 1.42f)
                lineTo(12.0f, 22.07f)
                lineToRelative(6.36f, -6.36f)
                lineToRelative(-1.41f, -1.42f)
                lineTo(12.0f, 19.24f)
                close()
                moveTo(5.64f, 8.29f)
                lineToRelative(1.41f, 1.42f)
                lineTo(12.0f, 4.76f)
                lineToRelative(4.95f, 4.95f)
                lineToRelative(1.41f, -1.42f)
                lineTo(12.0f, 1.93f)
                lineTo(5.64f, 8.29f)
                close()
            }
        }
        .build()
        return _bxExpandVertical!!
    }

private var _bxExpandVertical: ImageVector? = null
