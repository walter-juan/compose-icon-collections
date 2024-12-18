package com.woowla.compose.icon.collections.remix.remix.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.LogosGroup

public val LogosGroup.PixFill: ImageVector
    get() {
        if (_pixFill != null) {
            return _pixFill!!
        }
        _pixFill = Builder(name = "PixFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.475f, 1.768f)
                curveTo(13.109f, 0.401f, 10.892f, 0.401f, 9.526f, 1.768f)
                lineTo(5.399f, 5.894f)
                curveTo(6.504f, 5.826f, 7.633f, 6.214f, 8.478f, 7.058f)
                lineTo(11.47f, 10.051f)
                curveTo(11.763f, 10.344f, 12.238f, 10.344f, 12.531f, 10.051f)
                lineTo(15.524f, 7.058f)
                curveTo(16.368f, 6.214f, 17.497f, 5.826f, 18.602f, 5.895f)
                lineTo(14.475f, 1.768f)
                close()
                moveTo(20.454f, 7.746f)
                lineTo(22.233f, 9.525f)
                curveTo(23.594f, 10.887f, 23.6f, 13.091f, 22.249f, 14.459f)
                lineTo(20.474f, 16.233f)
                curveTo(19.302f, 17.405f, 17.403f, 17.405f, 16.231f, 16.233f)
                lineTo(13.238f, 13.24f)
                curveTo(12.555f, 12.557f, 11.447f, 12.557f, 10.763f, 13.24f)
                lineTo(7.77f, 16.234f)
                curveTo(6.598f, 17.405f, 4.699f, 17.405f, 3.527f, 16.234f)
                lineTo(1.748f, 14.454f)
                curveTo(0.401f, 13.086f, 0.408f, 10.885f, 1.768f, 9.525f)
                lineTo(3.543f, 7.751f)
                curveTo(4.716f, 6.594f, 6.604f, 6.599f, 7.771f, 7.765f)
                lineTo(10.763f, 10.758f)
                curveTo(11.447f, 11.441f, 12.555f, 11.441f, 13.238f, 10.758f)
                lineTo(16.231f, 7.765f)
                curveTo(17.396f, 6.6f, 19.281f, 6.594f, 20.454f, 7.746f)
                close()
                moveTo(5.398f, 18.104f)
                curveTo(6.503f, 18.173f, 7.632f, 17.785f, 8.477f, 16.941f)
                lineTo(11.47f, 13.947f)
                curveTo(11.763f, 13.654f, 12.238f, 13.654f, 12.531f, 13.947f)
                lineTo(15.524f, 16.941f)
                curveTo(16.369f, 17.785f, 17.498f, 18.173f, 18.603f, 18.104f)
                lineTo(14.475f, 22.232f)
                curveTo(13.109f, 23.599f, 10.892f, 23.599f, 9.526f, 22.232f)
                lineTo(5.398f, 18.104f)
                close()
            }
        }
        .build()
        return _pixFill!!
    }

private var _pixFill: ImageVector? = null
