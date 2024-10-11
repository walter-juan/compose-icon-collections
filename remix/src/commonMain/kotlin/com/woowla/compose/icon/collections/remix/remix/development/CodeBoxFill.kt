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

public val DevelopmentGroup.CodeBoxFill: ImageVector
    get() {
        if (_codeBoxFill != null) {
            return _codeBoxFill!!
        }
        _codeBoxFill = Builder(name = "CodeBoxFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                horizontalLineTo(21.0f)
                curveTo(21.552f, 3.0f, 22.0f, 3.448f, 22.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(22.0f, 20.552f, 21.552f, 21.0f, 21.0f, 21.0f)
                horizontalLineTo(3.0f)
                curveTo(2.448f, 21.0f, 2.0f, 20.552f, 2.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(2.0f, 3.448f, 2.448f, 3.0f, 3.0f, 3.0f)
                close()
                moveTo(16.465f, 15.535f)
                lineTo(20.0f, 12.0f)
                lineTo(16.465f, 8.464f)
                lineTo(15.05f, 9.879f)
                lineTo(17.172f, 12.0f)
                lineTo(15.05f, 14.121f)
                lineTo(16.465f, 15.535f)
                close()
                moveTo(6.828f, 12.0f)
                lineTo(8.95f, 9.879f)
                lineTo(7.536f, 8.464f)
                lineTo(4.0f, 12.0f)
                lineTo(7.536f, 15.535f)
                lineTo(8.95f, 14.121f)
                lineTo(6.828f, 12.0f)
                close()
                moveTo(11.244f, 17.0f)
                lineTo(14.884f, 7.0f)
                horizontalLineTo(12.756f)
                lineTo(9.116f, 17.0f)
                horizontalLineTo(11.244f)
                close()
            }
        }
        .build()
        return _codeBoxFill!!
    }

private var _codeBoxFill: ImageVector? = null
