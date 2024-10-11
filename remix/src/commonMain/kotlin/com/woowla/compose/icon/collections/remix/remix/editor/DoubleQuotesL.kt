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

public val EditorGroup.DoubleQuotesL: ImageVector
    get() {
        if (_doubleQuotesL != null) {
            return _doubleQuotesL!!
        }
        _doubleQuotesL = Builder(name = "DoubleQuotesL", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.583f, 17.321f)
                curveTo(3.553f, 16.227f, 3.0f, 15.0f, 3.0f, 13.01f)
                curveTo(3.0f, 9.511f, 5.457f, 6.374f, 9.031f, 4.823f)
                lineTo(9.923f, 6.201f)
                curveTo(6.588f, 8.005f, 5.936f, 10.346f, 5.676f, 11.822f)
                curveTo(6.213f, 11.544f, 6.916f, 11.447f, 7.605f, 11.51f)
                curveTo(9.409f, 11.678f, 10.831f, 13.159f, 10.831f, 15.0f)
                curveTo(10.831f, 16.933f, 9.264f, 18.5f, 7.331f, 18.5f)
                curveTo(6.258f, 18.5f, 5.232f, 18.01f, 4.583f, 17.321f)
                close()
                moveTo(14.583f, 17.321f)
                curveTo(13.553f, 16.227f, 13.0f, 15.0f, 13.0f, 13.01f)
                curveTo(13.0f, 9.511f, 15.457f, 6.374f, 19.031f, 4.823f)
                lineTo(19.923f, 6.201f)
                curveTo(16.588f, 8.005f, 15.936f, 10.346f, 15.676f, 11.822f)
                curveTo(16.213f, 11.544f, 16.916f, 11.447f, 17.605f, 11.51f)
                curveTo(19.409f, 11.678f, 20.831f, 13.159f, 20.831f, 15.0f)
                curveTo(20.831f, 16.933f, 19.264f, 18.5f, 17.331f, 18.5f)
                curveTo(16.258f, 18.5f, 15.232f, 18.01f, 14.583f, 17.321f)
                close()
            }
        }
        .build()
        return _doubleQuotesL!!
    }

private var _doubleQuotesL: ImageVector? = null
