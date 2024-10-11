package com.woowla.compose.icon.collections.remix.remix.editor

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.EditorGroup

public val EditorGroup.AB: ImageVector
    get() {
        if (_aB != null) {
            return _aB!!
        }
        _aB = Builder(name = "AB", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 15.0f)
                verticalLineTo(17.0f)
                curveTo(5.0f, 18.054f, 5.95f, 19.0f, 7.0f, 19.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(7.0f)
                curveTo(4.791f, 21.0f, 3.0f, 19.209f, 3.0f, 17.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(5.0f)
                close()
                moveTo(18.0f, 10.0f)
                lineTo(22.4f, 21.0f)
                horizontalLineTo(20.245f)
                lineTo(19.044f, 18.0f)
                horizontalLineTo(14.954f)
                lineTo(13.755f, 21.0f)
                horizontalLineTo(11.601f)
                lineTo(16.0f, 10.0f)
                horizontalLineTo(18.0f)
                close()
                moveTo(17.0f, 12.885f)
                lineTo(15.753f, 16.0f)
                horizontalLineTo(18.245f)
                lineTo(17.0f, 12.885f)
                close()
                moveTo(3.0f, 3.0f)
                horizontalLineTo(9.0f)
                curveTo(10.657f, 3.0f, 12.0f, 4.343f, 12.0f, 6.0f)
                curveTo(12.0f, 6.769f, 11.711f, 7.47f, 11.235f, 8.001f)
                curveTo(11.711f, 8.531f, 12.0f, 9.232f, 12.0f, 10.0f)
                curveTo(12.0f, 11.657f, 10.657f, 13.0f, 9.0f, 13.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(3.0f)
                close()
                moveTo(9.0f, 9.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(9.0f)
                curveTo(9.552f, 11.0f, 10.0f, 10.552f, 10.0f, 10.0f)
                curveTo(10.0f, 9.45f, 9.55f, 9.0f, 9.0f, 9.0f)
                close()
                moveTo(17.0f, 3.0f)
                curveTo(19.209f, 3.0f, 21.0f, 4.791f, 21.0f, 7.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(7.0f)
                curveTo(19.0f, 5.895f, 18.105f, 5.0f, 17.0f, 5.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(17.0f)
                close()
                moveTo(9.0f, 5.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(9.0f)
                curveTo(9.552f, 7.0f, 10.0f, 6.552f, 10.0f, 6.0f)
                curveTo(10.0f, 5.45f, 9.55f, 5.0f, 9.0f, 5.0f)
                close()
            }
        }
        .build()
        return _aB!!
    }

private var _aB: ImageVector? = null
