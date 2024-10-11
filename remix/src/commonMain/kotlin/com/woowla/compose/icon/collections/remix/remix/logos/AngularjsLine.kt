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

public val LogosGroup.AngularjsLine: ImageVector
    get() {
        if (_angularjsLine != null) {
            return _angularjsLine!!
        }
        _angularjsLine = Builder(name = "AngularjsLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.524f, 16.651f)
                lineTo(18.013f, 16.379f)
                lineTo(19.132f, 6.669f)
                lineTo(12.0f, 4.124f)
                lineTo(4.869f, 6.669f)
                lineTo(5.988f, 16.379f)
                lineTo(6.462f, 16.642f)
                lineTo(12.0f, 4.21f)
                lineTo(17.524f, 16.651f)
                close()
                moveTo(16.425f, 17.26f)
                horizontalLineTo(15.626f)
                lineTo(14.458f, 14.34f)
                horizontalLineTo(9.523f)
                lineTo(8.354f, 17.26f)
                horizontalLineTo(7.576f)
                lineTo(12.0f, 19.713f)
                lineTo(16.425f, 17.26f)
                close()
                moveTo(12.0f, 2.0f)
                lineTo(21.3f, 5.32f)
                lineTo(19.882f, 17.63f)
                lineTo(12.0f, 22.0f)
                lineTo(4.119f, 17.63f)
                lineTo(2.7f, 5.32f)
                lineTo(12.0f, 2.0f)
                close()
                moveTo(13.698f, 12.54f)
                lineTo(12.0f, 8.45f)
                lineTo(10.302f, 12.54f)
                horizontalLineTo(13.698f)
                close()
            }
        }
        .build()
        return _angularjsLine!!
    }

private var _angularjsLine: ImageVector? = null
