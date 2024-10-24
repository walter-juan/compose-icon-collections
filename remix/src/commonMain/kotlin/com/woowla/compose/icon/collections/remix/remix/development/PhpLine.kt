package com.woowla.compose.icon.collections.remix.remix.development

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.DevelopmentGroup

public val DevelopmentGroup.PhpLine: ImageVector
    get() {
        if (_phpLine != null) {
            return _phpLine!!
        }
        _phpLine = Builder(name = "PhpLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.15f, 5.55f)
                lineTo(8.433f, 14.384f)
                horizontalLineTo(10.433f)
                lineTo(11.291f, 9.967f)
                horizontalLineTo(12.791f)
                curveTo(13.344f, 9.967f, 13.706f, 10.407f, 13.601f, 10.949f)
                lineTo(12.933f, 14.384f)
                horizontalLineTo(14.933f)
                lineTo(15.601f, 10.949f)
                curveTo(15.917f, 9.322f, 14.83f, 8.004f, 13.173f, 8.004f)
                horizontalLineTo(11.673f)
                lineTo(12.15f, 5.55f)
                horizontalLineTo(10.15f)
                close()
                moveTo(2.173f, 8.004f)
                horizontalLineTo(5.923f)
                curveTo(7.718f, 8.004f, 8.895f, 9.432f, 8.553f, 11.194f)
                curveTo(8.21f, 12.956f, 6.478f, 14.384f, 4.683f, 14.384f)
                horizontalLineTo(2.933f)
                lineTo(2.456f, 16.839f)
                horizontalLineTo(0.456f)
                lineTo(2.173f, 8.004f)
                close()
                moveTo(3.314f, 12.421f)
                horizontalLineTo(5.064f)
                curveTo(5.755f, 12.421f, 6.421f, 11.872f, 6.553f, 11.194f)
                curveTo(6.684f, 10.517f, 6.232f, 9.967f, 5.541f, 9.967f)
                horizontalLineTo(3.791f)
                lineTo(3.314f, 12.421f)
                close()
                moveTo(17.173f, 8.004f)
                horizontalLineTo(20.923f)
                curveTo(22.718f, 8.004f, 23.895f, 9.432f, 23.553f, 11.194f)
                curveTo(23.21f, 12.956f, 21.478f, 14.384f, 19.683f, 14.384f)
                horizontalLineTo(17.933f)
                lineTo(17.456f, 16.839f)
                horizontalLineTo(15.456f)
                lineTo(17.173f, 8.004f)
                close()
                moveTo(18.314f, 12.421f)
                horizontalLineTo(20.064f)
                curveTo(20.755f, 12.421f, 21.421f, 11.872f, 21.553f, 11.194f)
                curveTo(21.684f, 10.517f, 21.232f, 9.967f, 20.541f, 9.967f)
                horizontalLineTo(18.791f)
                lineTo(18.314f, 12.421f)
                close()
            }
        }
        .build()
        return _phpLine!!
    }

private var _phpLine: ImageVector? = null
