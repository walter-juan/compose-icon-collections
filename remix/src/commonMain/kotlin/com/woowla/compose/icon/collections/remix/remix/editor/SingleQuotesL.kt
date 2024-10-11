package com.woowla.compose.icon.collections.remix.remix.editor

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.EditorGroup

public val EditorGroup.SingleQuotesL: ImageVector
    get() {
        if (_singleQuotesL != null) {
            return _singleQuotesL!!
        }
        _singleQuotesL = Builder(name = "SingleQuotesL", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.583f, 17.321f)
                curveTo(8.553f, 16.227f, 8.0f, 15.0f, 8.0f, 13.01f)
                curveTo(8.0f, 9.511f, 10.457f, 6.374f, 14.031f, 4.823f)
                lineTo(14.923f, 6.201f)
                curveTo(11.588f, 8.005f, 10.936f, 10.346f, 10.676f, 11.822f)
                curveTo(11.213f, 11.544f, 11.916f, 11.447f, 12.605f, 11.51f)
                curveTo(14.409f, 11.678f, 15.831f, 13.159f, 15.831f, 15.0f)
                curveTo(15.831f, 16.933f, 14.264f, 18.5f, 12.331f, 18.5f)
                curveTo(11.258f, 18.5f, 10.232f, 18.01f, 9.583f, 17.321f)
                close()
            }
        }
        .build()
        return _singleQuotesL!!
    }

private var _singleQuotesL: ImageVector? = null
