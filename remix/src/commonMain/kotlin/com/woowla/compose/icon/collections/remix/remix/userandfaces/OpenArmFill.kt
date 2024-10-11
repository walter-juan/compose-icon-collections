package com.woowla.compose.icon.collections.remix.remix.userandfaces

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.UserAndFacesGroup

public val UserAndFacesGroup.OpenArmFill: ImageVector
    get() {
        if (_openArmFill != null) {
            return _openArmFill!!
        }
        _openArmFill = Builder(name = "OpenArmFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 12.0f)
                curveTo(9.239f, 12.0f, 7.0f, 9.761f, 7.0f, 7.0f)
                curveTo(7.0f, 4.239f, 9.239f, 2.0f, 12.0f, 2.0f)
                curveTo(14.762f, 2.0f, 17.0f, 4.239f, 17.0f, 7.0f)
                curveTo(17.0f, 9.761f, 14.762f, 12.0f, 12.0f, 12.0f)
                close()
                moveTo(18.0f, 17.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(17.0f)
                curveTo(16.0f, 12.549f, 18.644f, 8.715f, 22.448f, 6.984f)
                lineTo(23.275f, 8.805f)
                curveTo(20.164f, 10.221f, 18.0f, 13.358f, 18.0f, 17.0f)
                close()
                moveTo(8.0f, 17.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(17.0f)
                curveTo(6.0f, 13.358f, 3.837f, 10.221f, 0.726f, 8.805f)
                lineTo(1.553f, 6.984f)
                curveTo(5.357f, 8.715f, 8.0f, 12.549f, 8.0f, 17.0f)
                close()
            }
        }
        .build()
        return _openArmFill!!
    }

private var _openArmFill: ImageVector? = null
