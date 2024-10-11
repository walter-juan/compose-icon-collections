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

public val SystemGroup.Settings5Fill: ImageVector
    get() {
        if (_settings5Fill != null) {
            return _settings5Fill!!
        }
        _settings5Fill = Builder(name = "Settings5Fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.131f, 13.631f)
                curveTo(1.949f, 12.535f, 1.955f, 11.434f, 2.132f, 10.37f)
                curveTo(3.233f, 10.396f, 4.224f, 9.868f, 4.609f, 8.939f)
                curveTo(4.994f, 8.009f, 4.667f, 6.936f, 3.869f, 6.176f)
                curveTo(4.497f, 5.298f, 5.271f, 4.515f, 6.175f, 3.869f)
                curveTo(6.935f, 4.667f, 8.009f, 4.994f, 8.938f, 4.609f)
                curveTo(9.868f, 4.224f, 10.396f, 3.233f, 10.369f, 2.132f)
                curveTo(11.465f, 1.95f, 12.566f, 1.956f, 13.63f, 2.133f)
                curveTo(13.604f, 3.234f, 14.132f, 4.224f, 15.061f, 4.609f)
                curveTo(15.99f, 4.994f, 17.064f, 4.667f, 17.824f, 3.87f)
                curveTo(18.702f, 4.497f, 19.485f, 5.272f, 20.131f, 6.175f)
                curveTo(19.333f, 6.935f, 19.006f, 8.009f, 19.391f, 8.939f)
                curveTo(19.776f, 9.868f, 20.767f, 10.397f, 21.868f, 10.37f)
                curveTo(22.05f, 11.465f, 22.044f, 12.566f, 21.867f, 13.631f)
                curveTo(20.766f, 13.604f, 19.776f, 14.132f, 19.391f, 15.062f)
                curveTo(19.006f, 15.991f, 19.333f, 17.065f, 20.13f, 17.824f)
                curveTo(19.503f, 18.702f, 18.728f, 19.485f, 17.825f, 20.131f)
                curveTo(17.065f, 19.333f, 15.991f, 19.006f, 15.061f, 19.391f)
                curveTo(14.132f, 19.776f, 13.603f, 20.767f, 13.63f, 21.869f)
                curveTo(12.534f, 22.051f, 11.434f, 22.045f, 10.369f, 21.868f)
                curveTo(10.396f, 20.767f, 9.867f, 19.776f, 8.938f, 19.391f)
                curveTo(8.009f, 19.006f, 6.935f, 19.333f, 6.175f, 20.131f)
                curveTo(5.297f, 19.503f, 4.515f, 18.729f, 3.869f, 17.825f)
                curveTo(4.667f, 17.065f, 4.994f, 15.991f, 4.609f, 15.062f)
                curveTo(4.224f, 14.132f, 3.233f, 13.604f, 2.131f, 13.631f)
                close()
                moveTo(12.0f, 15.0f)
                curveTo(13.656f, 15.0f, 15.0f, 13.657f, 15.0f, 12.0f)
                curveTo(15.0f, 10.343f, 13.656f, 9.0f, 12.0f, 9.0f)
                curveTo(10.343f, 9.0f, 9.0f, 10.343f, 9.0f, 12.0f)
                curveTo(9.0f, 13.657f, 10.343f, 15.0f, 12.0f, 15.0f)
                close()
            }
        }
        .build()
        return _settings5Fill!!
    }

private var _settings5Fill: ImageVector? = null
