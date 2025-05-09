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

public val DesignGroup.BlurOffLine: ImageVector
    get() {
        if (_blurOffLine != null) {
            return _blurOffLine!!
        }
        _blurOffLine = Builder(name = "BlurOffLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.154f, 19.565f)
                curveTo(14.625f, 22.874f, 9.082f, 22.806f, 5.636f, 19.361f)
                curveTo(2.191f, 15.915f, 2.123f, 10.372f, 5.432f, 6.843f)
                lineTo(1.394f, 2.804f)
                lineTo(2.808f, 1.39f)
                lineTo(22.607f, 21.189f)
                lineTo(21.192f, 22.603f)
                lineTo(18.154f, 19.565f)
                close()
                moveTo(6.848f, 8.258f)
                curveTo(4.319f, 11.005f, 4.386f, 15.282f, 7.05f, 17.947f)
                curveTo(9.715f, 20.611f, 13.992f, 20.678f, 16.739f, 18.149f)
                lineTo(6.848f, 8.258f)
                close()
                moveTo(20.414f, 16.197f)
                lineTo(18.816f, 14.598f)
                curveTo(19.349f, 12.319f, 18.727f, 9.824f, 16.95f, 8.047f)
                lineTo(12.0f, 3.097f)
                lineTo(9.658f, 5.44f)
                lineTo(8.243f, 4.026f)
                lineTo(12.0f, 0.269f)
                lineTo(18.364f, 6.633f)
                curveTo(20.95f, 9.219f, 21.633f, 12.986f, 20.414f, 16.197f)
                close()
            }
        }
        .build()
        return _blurOffLine!!
    }

private var _blurOffLine: ImageVector? = null
