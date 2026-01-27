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

public val LogosGroup.ZhipuAiLine: ImageVector
    get() {
        if (_zhipuAiLine != null) {
            return _zhipuAiLine!!
        }
        _zhipuAiLine = Builder(name = "ZhipuAiLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.531f, 3.015f)
                curveTo(19.918f, 3.156f, 21.0f, 4.326f, 21.0f, 5.75f)
                verticalLineTo(18.25f)
                lineTo(20.985f, 18.531f)
                curveTo(20.844f, 19.918f, 19.674f, 21.0f, 18.25f, 21.0f)
                horizontalLineTo(5.75f)
                curveTo(4.231f, 21.0f, 3.0f, 19.769f, 3.0f, 18.25f)
                verticalLineTo(5.75f)
                curveTo(3.0f, 4.326f, 4.082f, 3.156f, 5.469f, 3.015f)
                lineTo(5.75f, 3.0f)
                horizontalLineTo(18.25f)
                lineTo(18.531f, 3.015f)
                close()
                moveTo(5.75f, 5.0f)
                curveTo(5.336f, 5.0f, 5.0f, 5.336f, 5.0f, 5.75f)
                verticalLineTo(18.25f)
                curveTo(5.0f, 18.664f, 5.336f, 19.0f, 5.75f, 19.0f)
                horizontalLineTo(18.25f)
                curveTo(18.664f, 19.0f, 19.0f, 18.664f, 19.0f, 18.25f)
                verticalLineTo(5.75f)
                curveTo(19.0f, 5.336f, 18.664f, 5.0f, 18.25f, 5.0f)
                horizontalLineTo(5.75f)
                close()
                moveTo(10.763f, 17.268f)
                horizontalLineTo(5.809f)
                lineTo(13.24f, 6.739f)
                horizontalLineTo(18.194f)
                lineTo(10.763f, 17.268f)
                close()
                moveTo(17.882f, 17.268f)
                horizontalLineTo(11.689f)
                lineTo(12.561f, 16.029f)
                curveTo(12.695f, 15.836f, 12.921f, 15.717f, 13.16f, 15.717f)
                horizontalLineTo(17.882f)
                verticalLineTo(17.268f)
                close()
                moveTo(12.314f, 6.739f)
                lineTo(11.449f, 7.972f)
                curveTo(11.316f, 8.165f, 11.089f, 8.284f, 10.85f, 8.284f)
                horizontalLineTo(6.121f)
                verticalLineTo(6.733f)
                curveTo(6.133f, 6.74f, 12.306f, 6.739f, 12.314f, 6.739f)
                close()
            }
        }
        .build()
        return _zhipuAiLine!!
    }

private var _zhipuAiLine: ImageVector? = null
