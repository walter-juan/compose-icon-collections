package com.woowla.compose.icon.collections.remix.remix.food

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.FoodGroup

public val FoodGroup.Cake3Fill: ImageVector
    get() {
        if (_cake3Fill != null) {
            return _cake3Fill!!
        }
        _cake3Fill = Builder(name = "Cake3Fill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.5f, 2.0f)
                curveTo(17.433f, 2.0f, 19.0f, 3.567f, 19.0f, 5.5f)
                curveTo(19.0f, 5.727f, 18.978f, 5.949f, 18.937f, 6.163f)
                lineTo(18.922f, 6.229f)
                curveTo(20.711f, 6.825f, 22.0f, 8.512f, 22.0f, 10.5f)
                curveTo(22.0f, 12.374f, 20.854f, 13.981f, 19.225f, 14.657f)
                lineTo(18.139f, 21.164f)
                curveTo(18.059f, 21.647f, 17.642f, 22.0f, 17.153f, 22.0f)
                horizontalLineTo(6.847f)
                curveTo(6.358f, 22.0f, 5.941f, 21.647f, 5.861f, 21.164f)
                lineTo(4.832f, 14.994f)
                curveTo(3.249f, 14.904f, 2.0f, 13.598f, 2.0f, 12.0f)
                curveTo(2.0f, 10.693f, 2.836f, 9.581f, 4.003f, 9.17f)
                lineTo(4.0f, 9.0f)
                curveTo(4.0f, 5.686f, 6.686f, 3.0f, 10.0f, 3.0f)
                curveTo(10.922f, 3.0f, 11.795f, 3.208f, 12.575f, 3.579f)
                curveTo(13.199f, 2.628f, 14.276f, 2.0f, 15.5f, 2.0f)
                close()
                moveTo(11.0f, 15.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(15.0f)
                close()
                moveTo(15.0f, 15.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(15.0f)
                close()
                moveTo(17.5f, 13.0f)
                curveTo(18.881f, 13.0f, 20.0f, 11.881f, 20.0f, 10.5f)
                curveTo(20.0f, 9.119f, 18.881f, 8.0f, 17.5f, 8.0f)
                curveTo(17.164f, 8.0f, 16.842f, 8.065f, 16.544f, 8.19f)
                lineTo(16.369f, 8.271f)
                curveTo(15.402f, 8.769f, 14.225f, 8.402f, 13.706f, 7.467f)
                lineTo(13.636f, 7.33f)
                curveTo(12.988f, 5.921f, 11.578f, 5.0f, 10.0f, 5.0f)
                curveTo(7.858f, 5.0f, 6.109f, 6.684f, 6.005f, 8.767f)
                lineTo(6.0f, 8.964f)
                lineTo(6.003f, 9.134f)
                curveTo(6.017f, 9.941f, 5.545f, 10.673f, 4.817f, 10.997f)
                lineTo(4.668f, 11.056f)
                curveTo(4.271f, 11.196f, 4.0f, 11.572f, 4.0f, 12.0f)
                curveTo(4.0f, 12.552f, 4.448f, 13.0f, 5.0f, 13.0f)
                horizontalLineTo(17.5f)
                close()
            }
        }
        .build()
        return _cake3Fill!!
    }

private var _cake3Fill: ImageVector? = null
