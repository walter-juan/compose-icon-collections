package com.woowla.compose.icon.collections.remix.remix.system

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.SystemGroup

public val SystemGroup.AddLargeFill: ImageVector
    get() {
        if (_addLargeFill != null) {
            return _addLargeFill!!
        }
        _addLargeFill = Builder(name = "AddLargeFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 11.0f)
                lineTo(11.0f, 2.0f)
                lineTo(13.0f, 2.0f)
                lineTo(13.0f, 11.0f)
                lineTo(22.0f, 11.0f)
                lineTo(22.0f, 13.0f)
                lineTo(13.0f, 13.0f)
                lineTo(13.0f, 22.0f)
                lineTo(11.0f, 22.0f)
                lineTo(11.0f, 13.0f)
                lineTo(2.0f, 13.0f)
                lineTo(2.0f, 11.0f)
                lineTo(11.0f, 11.0f)
                close()
            }
        }
        .build()
        return _addLargeFill!!
    }

private var _addLargeFill: ImageVector? = null
