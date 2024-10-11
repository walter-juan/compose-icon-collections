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

public val OthersGroup.Box3Fill: ImageVector
    get() {
        if (_box3Fill != null) {
            return _box3Fill!!
        }
        _box3Fill = Builder(name = "Box3Fill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.502f, 5.922f)
                lineTo(12.0f, 1.0f)
                lineTo(3.498f, 5.922f)
                lineTo(12.0f, 10.844f)
                lineTo(20.502f, 5.922f)
                close()
                moveTo(2.5f, 7.655f)
                verticalLineTo(17.5f)
                lineTo(11.0f, 22.421f)
                verticalLineTo(12.576f)
                lineTo(2.5f, 7.655f)
                close()
                moveTo(13.0f, 22.421f)
                lineTo(21.5f, 17.5f)
                verticalLineTo(7.655f)
                lineTo(13.0f, 12.576f)
                verticalLineTo(22.421f)
                close()
            }
        }
        .build()
        return _box3Fill!!
    }

private var _box3Fill: ImageVector? = null
