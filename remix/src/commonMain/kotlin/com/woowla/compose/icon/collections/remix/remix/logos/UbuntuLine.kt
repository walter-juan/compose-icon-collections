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

public val LogosGroup.UbuntuLine: ImageVector
    get() {
        if (_ubuntuLine != null) {
            return _ubuntuLine!!
        }
        _ubuntuLine = Builder(name = "UbuntuLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.668f, 19.273f)
                lineTo(9.674f, 17.531f)
                curveTo(12.421f, 18.691f, 15.667f, 17.65f, 17.197f, 15.0f)
                curveTo(17.61f, 14.285f, 17.859f, 13.521f, 17.955f, 12.75f)
                horizontalLineTo(19.968f)
                curveTo(19.864f, 13.862f, 19.524f, 14.969f, 18.929f, 16.0f)
                curveTo(18.527f, 16.697f, 18.035f, 17.311f, 17.477f, 17.835f)
                curveTo(16.838f, 17.641f, 16.124f, 17.702f, 15.501f, 18.062f)
                curveTo(14.878f, 18.422f, 14.469f, 19.009f, 14.317f, 19.657f)
                curveTo(12.5f, 20.207f, 10.492f, 20.112f, 8.668f, 19.273f)
                close()
                moveTo(7.369f, 18.523f)
                curveTo(5.73f, 17.362f, 4.644f, 15.671f, 4.211f, 13.823f)
                curveTo(4.697f, 13.367f, 5.001f, 12.719f, 5.001f, 12.0f)
                curveTo(5.001f, 11.28f, 4.697f, 10.631f, 4.21f, 10.175f)
                curveTo(4.385f, 9.43f, 4.67f, 8.697f, 5.073f, 8.0f)
                curveTo(5.668f, 6.97f, 6.457f, 6.122f, 7.368f, 5.476f)
                lineTo(8.374f, 7.218f)
                curveTo(7.755f, 7.687f, 7.218f, 8.285f, 6.805f, 9.0f)
                curveTo(5.275f, 11.65f, 5.996f, 14.981f, 8.375f, 16.781f)
                lineTo(7.369f, 18.523f)
                close()
                moveTo(8.668f, 4.727f)
                curveTo(10.412f, 3.929f, 12.422f, 3.766f, 14.316f, 4.34f)
                curveTo(14.468f, 4.99f, 14.878f, 5.578f, 15.501f, 5.938f)
                curveTo(16.124f, 6.298f, 16.838f, 6.359f, 17.477f, 6.165f)
                curveTo(18.921f, 7.518f, 19.785f, 9.34f, 19.966f, 11.25f)
                horizontalLineTo(17.954f)
                curveTo(17.726f, 9.453f, 16.691f, 7.779f, 15.001f, 6.804f)
                curveTo(13.311f, 5.828f, 11.344f, 5.768f, 9.674f, 6.469f)
                lineTo(8.668f, 4.727f)
                close()
                moveTo(16.001f, 5.072f)
                curveTo(15.283f, 4.658f, 15.038f, 3.74f, 15.452f, 3.023f)
                curveTo(15.866f, 2.305f, 16.784f, 2.059f, 17.501f, 2.474f)
                curveTo(18.218f, 2.888f, 18.464f, 3.805f, 18.05f, 4.523f)
                curveTo(17.636f, 5.24f, 16.718f, 5.486f, 16.001f, 5.072f)
                close()
                moveTo(4.001f, 12.0f)
                curveTo(4.001f, 12.828f, 3.329f, 13.5f, 2.501f, 13.5f)
                curveTo(1.673f, 13.5f, 1.001f, 12.828f, 1.001f, 12.0f)
                curveTo(1.001f, 11.172f, 1.673f, 10.5f, 2.501f, 10.5f)
                curveTo(3.329f, 10.5f, 4.001f, 11.172f, 4.001f, 12.0f)
                close()
                moveTo(16.001f, 18.928f)
                curveTo(16.718f, 18.514f, 17.636f, 18.76f, 18.05f, 19.477f)
                curveTo(18.464f, 20.195f, 18.218f, 21.112f, 17.501f, 21.526f)
                curveTo(16.784f, 21.94f, 15.866f, 21.695f, 15.452f, 20.977f)
                curveTo(15.038f, 20.26f, 15.283f, 19.342f, 16.001f, 18.928f)
                close()
            }
        }
        .build()
        return _ubuntuLine!!
    }

private var _ubuntuLine: ImageVector? = null
