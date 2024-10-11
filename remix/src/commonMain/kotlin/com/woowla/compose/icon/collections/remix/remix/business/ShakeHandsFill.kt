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

public val BusinessGroup.ShakeHandsFill: ImageVector
    get() {
        if (_shakeHandsFill != null) {
            return _shakeHandsFill!!
        }
        _shakeHandsFill = Builder(name = "ShakeHandsFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.291f, 6.0f)
                horizontalLineTo(20.0f)
                curveTo(20.552f, 6.0f, 21.0f, 6.448f, 21.0f, 7.0f)
                verticalLineTo(14.0f)
                curveTo(21.0f, 14.552f, 20.552f, 15.0f, 20.0f, 15.0f)
                horizontalLineTo(18.0f)
                lineTo(13.832f, 9.164f)
                curveTo(13.335f, 8.468f, 12.449f, 8.165f, 11.63f, 8.411f)
                lineTo(9.144f, 9.157f)
                curveTo(8.44f, 9.368f, 7.676f, 9.176f, 7.156f, 8.655f)
                lineTo(6.863f, 8.362f)
                curveTo(6.417f, 7.916f, 6.49f, 7.173f, 7.015f, 6.823f)
                lineTo(12.416f, 3.223f)
                curveTo(13.075f, 2.783f, 13.931f, 2.774f, 14.599f, 3.199f)
                lineTo(18.755f, 5.844f)
                curveTo(18.915f, 5.946f, 19.101f, 6.0f, 19.291f, 6.0f)
                close()
                moveTo(5.027f, 14.295f)
                lineTo(3.411f, 15.708f)
                curveTo(2.94f, 16.121f, 2.959f, 16.86f, 3.452f, 17.247f)
                lineTo(8.593f, 21.287f)
                curveTo(9.073f, 21.664f, 9.776f, 21.526f, 10.079f, 20.996f)
                lineTo(10.783f, 19.764f)
                curveTo(11.213f, 19.012f, 11.109f, 18.068f, 10.526f, 17.427f)
                lineTo(7.824f, 14.455f)
                curveTo(7.091f, 13.648f, 5.847f, 13.577f, 5.027f, 14.295f)
                close()
                moveTo(7.046f, 5.0f)
                horizontalLineTo(3.0f)
                curveTo(2.448f, 5.0f, 2.0f, 5.448f, 2.0f, 6.0f)
                verticalLineTo(13.516f)
                curveTo(2.0f, 13.924f, 2.125f, 14.317f, 2.35f, 14.646f)
                curveTo(2.374f, 14.624f, 2.399f, 14.601f, 2.424f, 14.58f)
                lineTo(4.039f, 13.166f)
                curveTo(5.475f, 11.91f, 7.651f, 12.034f, 8.934f, 13.446f)
                lineTo(11.636f, 16.418f)
                curveTo(12.656f, 17.54f, 12.838f, 19.192f, 12.085f, 20.509f)
                lineTo(11.431f, 21.654f)
                curveTo(11.994f, 21.867f, 12.635f, 21.819f, 13.169f, 21.499f)
                lineTo(17.578f, 18.853f)
                curveTo(18.079f, 18.553f, 18.217f, 17.89f, 17.878f, 17.415f)
                lineTo(12.611f, 10.036f)
                curveTo(12.486f, 9.862f, 12.265f, 9.786f, 12.06f, 9.848f)
                lineTo(9.575f, 10.593f)
                curveTo(8.342f, 10.963f, 7.005f, 10.626f, 6.094f, 9.716f)
                lineTo(5.802f, 9.423f)
                curveTo(4.686f, 8.308f, 4.87f, 6.45f, 6.183f, 5.575f)
                lineTo(7.046f, 5.0f)
                close()
            }
        }
        .build()
        return _shakeHandsFill!!
    }

private var _shakeHandsFill: ImageVector? = null
