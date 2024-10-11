package com.woowla.compose.icon.collections.remix.remix.design

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.DesignGroup

public val DesignGroup.MagicFill: ImageVector
    get() {
        if (_magicFill != null) {
            return _magicFill!!
        }
        _magicFill = Builder(name = "MagicFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.224f, 15.508f)
                lineTo(13.011f, 20.158f)
                curveTo(12.869f, 20.457f, 12.511f, 20.584f, 12.212f, 20.442f)
                curveTo(12.145f, 20.41f, 12.085f, 20.367f, 12.034f, 20.313f)
                lineTo(8.492f, 16.574f)
                curveTo(8.397f, 16.474f, 8.271f, 16.41f, 8.134f, 16.392f)
                lineTo(3.028f, 15.724f)
                curveTo(2.7f, 15.681f, 2.468f, 15.38f, 2.511f, 15.052f)
                curveTo(2.521f, 14.978f, 2.544f, 14.908f, 2.579f, 14.843f)
                lineTo(5.04f, 10.319f)
                curveTo(5.106f, 10.198f, 5.128f, 10.058f, 5.103f, 9.923f)
                lineTo(4.16f, 4.86f)
                curveTo(4.099f, 4.534f, 4.314f, 4.221f, 4.64f, 4.16f)
                curveTo(4.713f, 4.147f, 4.787f, 4.147f, 4.86f, 4.16f)
                lineTo(9.922f, 5.103f)
                curveTo(10.058f, 5.129f, 10.198f, 5.106f, 10.319f, 5.04f)
                lineTo(14.842f, 2.579f)
                curveTo(15.134f, 2.421f, 15.498f, 2.528f, 15.656f, 2.819f)
                curveTo(15.692f, 2.884f, 15.715f, 2.955f, 15.724f, 3.028f)
                lineTo(16.392f, 8.135f)
                curveTo(16.41f, 8.271f, 16.474f, 8.398f, 16.574f, 8.492f)
                lineTo(20.313f, 12.034f)
                curveTo(20.553f, 12.262f, 20.564f, 12.642f, 20.336f, 12.882f)
                curveTo(20.285f, 12.936f, 20.225f, 12.979f, 20.158f, 13.011f)
                lineTo(15.508f, 15.224f)
                curveTo(15.383f, 15.283f, 15.283f, 15.384f, 15.224f, 15.508f)
                close()
                moveTo(16.021f, 17.435f)
                lineTo(17.435f, 16.021f)
                lineTo(21.677f, 20.263f)
                lineTo(20.263f, 21.678f)
                lineTo(16.021f, 17.435f)
                close()
            }
        }
        .build()
        return _magicFill!!
    }

private var _magicFill: ImageVector? = null
