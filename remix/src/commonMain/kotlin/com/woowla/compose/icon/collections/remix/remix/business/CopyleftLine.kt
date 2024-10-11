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

public val BusinessGroup.CopyleftLine: ImageVector
    get() {
        if (_copyleftLine != null) {
            return _copyleftLine!!
        }
        _copyleftLine = Builder(name = "CopyleftLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                curveTo(6.48f, 22.0f, 2.0f, 17.52f, 2.0f, 12.0f)
                curveTo(2.0f, 6.48f, 6.48f, 2.0f, 12.0f, 2.0f)
                curveTo(17.52f, 2.0f, 22.0f, 6.48f, 22.0f, 12.0f)
                curveTo(22.0f, 17.52f, 17.52f, 22.0f, 12.0f, 22.0f)
                close()
                moveTo(12.0f, 20.0f)
                curveTo(16.42f, 20.0f, 20.0f, 16.42f, 20.0f, 12.0f)
                curveTo(20.0f, 7.58f, 16.42f, 4.0f, 12.0f, 4.0f)
                curveTo(7.58f, 4.0f, 4.0f, 7.58f, 4.0f, 12.0f)
                curveTo(4.0f, 16.42f, 7.58f, 20.0f, 12.0f, 20.0f)
                close()
                moveTo(12.0f, 17.0f)
                curveTo(10.181f, 17.0f, 8.587f, 16.027f, 7.712f, 14.572f)
                lineTo(9.426f, 13.543f)
                curveTo(9.951f, 14.416f, 10.907f, 15.0f, 12.0f, 15.0f)
                curveTo(13.658f, 15.0f, 15.0f, 13.658f, 15.0f, 12.0f)
                curveTo(15.0f, 10.342f, 13.658f, 9.0f, 12.0f, 9.0f)
                curveTo(10.907f, 9.0f, 9.952f, 9.583f, 9.427f, 10.456f)
                lineTo(7.712f, 9.428f)
                curveTo(8.587f, 7.973f, 10.181f, 7.0f, 12.0f, 7.0f)
                curveTo(14.76f, 7.0f, 17.0f, 9.24f, 17.0f, 12.0f)
                curveTo(17.0f, 14.76f, 14.76f, 17.0f, 12.0f, 17.0f)
                close()
            }
        }
        .build()
        return _copyleftLine!!
    }

private var _copyleftLine: ImageVector? = null
