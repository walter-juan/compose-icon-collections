package com.woowla.compose.icon.collections.heroicons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.heroicons.heroicons.SolidGroup

public val SolidGroup.Server: ImageVector
    get() {
        if (_server != null) {
            return _server!!
        }
        _server = Builder(name = "Server", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.08f, 5.227f)
                curveTo(4.43f, 3.914f, 5.619f, 3.0f, 6.979f, 3.0f)
                horizontalLineTo(17.021f)
                curveTo(18.381f, 3.0f, 19.57f, 3.914f, 19.92f, 5.227f)
                lineTo(22.034f, 13.153f)
                curveTo(21.135f, 12.432f, 19.993f, 12.0f, 18.75f, 12.0f)
                horizontalLineTo(5.25f)
                curveTo(4.007f, 12.0f, 2.865f, 12.432f, 1.966f, 13.153f)
                lineTo(4.08f, 5.227f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.25f, 13.5f)
                curveTo(3.179f, 13.5f, 1.5f, 15.179f, 1.5f, 17.25f)
                curveTo(1.5f, 19.321f, 3.179f, 21.0f, 5.25f, 21.0f)
                horizontalLineTo(18.75f)
                curveTo(20.821f, 21.0f, 22.5f, 19.321f, 22.5f, 17.25f)
                curveTo(22.5f, 15.179f, 20.821f, 13.5f, 18.75f, 13.5f)
                horizontalLineTo(5.25f)
                close()
                moveTo(15.75f, 18.0f)
                curveTo(16.164f, 18.0f, 16.5f, 17.664f, 16.5f, 17.25f)
                curveTo(16.5f, 16.836f, 16.164f, 16.5f, 15.75f, 16.5f)
                curveTo(15.336f, 16.5f, 15.0f, 16.836f, 15.0f, 17.25f)
                curveTo(15.0f, 17.664f, 15.336f, 18.0f, 15.75f, 18.0f)
                close()
                moveTo(19.5f, 17.25f)
                curveTo(19.5f, 17.664f, 19.164f, 18.0f, 18.75f, 18.0f)
                curveTo(18.336f, 18.0f, 18.0f, 17.664f, 18.0f, 17.25f)
                curveTo(18.0f, 16.836f, 18.336f, 16.5f, 18.75f, 16.5f)
                curveTo(19.164f, 16.5f, 19.5f, 16.836f, 19.5f, 17.25f)
                close()
            }
        }
        .build()
        return _server!!
    }

private var _server: ImageVector? = null
