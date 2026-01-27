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

public val LogosGroup.ZhipuAiFill: ImageVector
    get() {
        if (_zhipuAiFill != null) {
            return _zhipuAiFill!!
        }
        _zhipuAiFill = Builder(name = "ZhipuAiFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.25f, 3.0f)
                curveTo(19.769f, 3.0f, 21.0f, 4.231f, 21.0f, 5.75f)
                verticalLineTo(18.25f)
                curveTo(21.0f, 19.769f, 19.769f, 21.0f, 18.25f, 21.0f)
                horizontalLineTo(5.75f)
                curveTo(4.231f, 21.0f, 3.0f, 19.769f, 3.0f, 18.25f)
                verticalLineTo(5.75f)
                curveTo(3.0f, 4.231f, 4.231f, 3.0f, 5.75f, 3.0f)
                horizontalLineTo(18.25f)
                close()
                moveTo(13.24f, 6.739f)
                lineTo(5.809f, 17.268f)
                horizontalLineTo(10.763f)
                lineTo(18.194f, 6.739f)
                horizontalLineTo(13.24f)
                close()
                moveTo(13.16f, 15.717f)
                curveTo(12.921f, 15.717f, 12.695f, 15.836f, 12.561f, 16.029f)
                lineTo(11.689f, 17.268f)
                horizontalLineTo(17.882f)
                verticalLineTo(15.717f)
                horizontalLineTo(13.16f)
                close()
                moveTo(6.121f, 8.284f)
                horizontalLineTo(10.85f)
                curveTo(11.089f, 8.284f, 11.316f, 8.165f, 11.449f, 7.972f)
                lineTo(12.314f, 6.739f)
                curveTo(12.306f, 6.739f, 6.133f, 6.74f, 6.121f, 6.733f)
                verticalLineTo(8.284f)
                close()
            }
        }
        .build()
        return _zhipuAiFill!!
    }

private var _zhipuAiFill: ImageVector? = null
