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

public val LogosGroup.CodepenLine: ImageVector
    get() {
        if (_codepenLine != null) {
            return _codepenLine!!
        }
        _codepenLine = Builder(name = "CodepenLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.5f, 13.202f)
                lineTo(13.0f, 15.535f)
                verticalLineTo(19.132f)
                lineTo(19.197f, 15.0f)
                lineTo(16.5f, 13.202f)
                close()
                moveTo(14.697f, 12.0f)
                lineTo(12.0f, 10.202f)
                lineTo(9.303f, 12.0f)
                lineTo(12.0f, 13.798f)
                lineTo(14.697f, 12.0f)
                close()
                moveTo(20.0f, 10.868f)
                lineTo(18.303f, 12.0f)
                lineTo(20.0f, 13.132f)
                verticalLineTo(10.868f)
                close()
                moveTo(19.197f, 9.0f)
                lineTo(13.0f, 4.869f)
                verticalLineTo(8.465f)
                lineTo(16.5f, 10.798f)
                lineTo(19.197f, 9.0f)
                close()
                moveTo(7.5f, 10.798f)
                lineTo(11.0f, 8.465f)
                verticalLineTo(4.869f)
                lineTo(4.803f, 9.0f)
                lineTo(7.5f, 10.798f)
                close()
                moveTo(4.803f, 15.0f)
                lineTo(11.0f, 19.132f)
                verticalLineTo(15.535f)
                lineTo(7.5f, 13.202f)
                lineTo(4.803f, 15.0f)
                close()
                moveTo(4.0f, 13.132f)
                lineTo(5.697f, 12.0f)
                lineTo(4.0f, 10.868f)
                verticalLineTo(13.132f)
                close()
                moveTo(2.0f, 9.0f)
                curveTo(2.0f, 8.666f, 2.167f, 8.353f, 2.445f, 8.168f)
                lineTo(11.445f, 2.168f)
                curveTo(11.781f, 1.944f, 12.219f, 1.944f, 12.555f, 2.168f)
                lineTo(21.555f, 8.168f)
                curveTo(21.833f, 8.353f, 22.0f, 8.666f, 22.0f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(22.0f, 15.334f, 21.833f, 15.647f, 21.555f, 15.832f)
                lineTo(12.555f, 21.832f)
                curveTo(12.219f, 22.056f, 11.781f, 22.056f, 11.445f, 21.832f)
                lineTo(2.445f, 15.832f)
                curveTo(2.167f, 15.647f, 2.0f, 15.334f, 2.0f, 15.0f)
                verticalLineTo(9.0f)
                close()
            }
        }
        .build()
        return _codepenLine!!
    }

private var _codepenLine: ImageVector? = null
