package com.woowla.compose.icon.collections.remix.remix.others

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.OthersGroup

public val OthersGroup.Box3Line: ImageVector
    get() {
        if (_box3Line != null) {
            return _box3Line!!
        }
        _box3Line = Builder(name = "Box3Line", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 1.0f)
                lineTo(21.5f, 6.5f)
                verticalLineTo(17.5f)
                lineTo(12.0f, 23.0f)
                lineTo(2.5f, 17.5f)
                verticalLineTo(6.5f)
                lineTo(12.0f, 1.0f)
                close()
                moveTo(5.494f, 7.078f)
                lineTo(12.0f, 10.844f)
                lineTo(18.506f, 7.078f)
                lineTo(12.0f, 3.311f)
                lineTo(5.494f, 7.078f)
                close()
                moveTo(4.5f, 8.813f)
                verticalLineTo(16.347f)
                lineTo(11.0f, 20.11f)
                verticalLineTo(12.576f)
                lineTo(4.5f, 8.813f)
                close()
                moveTo(13.0f, 20.11f)
                lineTo(19.5f, 16.347f)
                verticalLineTo(8.813f)
                lineTo(13.0f, 12.576f)
                verticalLineTo(20.11f)
                close()
            }
        }
        .build()
        return _box3Line!!
    }

private var _box3Line: ImageVector? = null
