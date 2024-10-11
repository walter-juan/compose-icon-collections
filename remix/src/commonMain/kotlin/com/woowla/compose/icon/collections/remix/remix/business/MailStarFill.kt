package com.woowla.compose.icon.collections.remix.remix.business

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.BusinessGroup

public val BusinessGroup.MailStarFill: ImageVector
    get() {
        if (_mailStarFill != null) {
            return _mailStarFill!!
        }
        _mailStarFill = Builder(name = "MailStarFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 14.044f)
                curveTo(21.239f, 13.695f, 20.392f, 13.5f, 19.5f, 13.5f)
                curveTo(16.186f, 13.5f, 13.5f, 16.186f, 13.5f, 19.5f)
                curveTo(13.5f, 20.018f, 13.566f, 20.521f, 13.689f, 21.0f)
                horizontalLineTo(3.0f)
                curveTo(2.448f, 21.0f, 2.0f, 20.552f, 2.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(2.0f, 3.448f, 2.448f, 3.0f, 3.0f, 3.0f)
                horizontalLineTo(21.0f)
                curveTo(21.552f, 3.0f, 22.0f, 3.448f, 22.0f, 4.0f)
                verticalLineTo(14.044f)
                close()
                moveTo(12.061f, 11.683f)
                lineTo(5.647f, 6.238f)
                lineTo(4.353f, 7.762f)
                lineTo(12.073f, 14.317f)
                lineTo(19.654f, 7.756f)
                lineTo(18.346f, 6.244f)
                lineTo(12.061f, 11.683f)
                close()
                moveTo(19.5f, 21.75f)
                lineTo(16.855f, 23.141f)
                lineTo(17.36f, 20.195f)
                lineTo(15.22f, 18.109f)
                lineTo(18.177f, 17.68f)
                lineTo(19.5f, 15.0f)
                lineTo(20.823f, 17.68f)
                lineTo(23.78f, 18.109f)
                lineTo(21.64f, 20.195f)
                lineTo(22.145f, 23.141f)
                lineTo(19.5f, 21.75f)
                close()
            }
        }
        .build()
        return _mailStarFill!!
    }

private var _mailStarFill: ImageVector? = null
