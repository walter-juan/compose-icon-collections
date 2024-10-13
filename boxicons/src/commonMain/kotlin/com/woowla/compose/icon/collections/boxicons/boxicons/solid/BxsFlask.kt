package com.woowla.compose.icon.collections.boxicons.boxicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.SolidGroup

public val SolidGroup.BxsFlask: ImageVector
    get() {
        if (_bxsFlask != null) {
            return _bxsFlask!!
        }
        _bxsFlask = Builder(name = "BxsFlask", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 9.783f)
                lineTo(15.0f, 4.0f)
                horizontalLineToRelative(1.0f)
                lineTo(16.0f, 2.0f)
                lineTo(8.0f, 2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(5.783f)
                lineToRelative(-4.268f, 9.389f)
                arcToRelative(1.992f, 1.992f, 0.0f, false, false, 0.14f, 1.911f)
                arcTo(1.99f, 1.99f, 0.0f, false, false, 6.553f, 22.0f)
                horizontalLineToRelative(10.895f)
                arcToRelative(1.99f, 1.99f, 0.0f, false, false, 1.681f, -0.917f)
                curveToRelative(0.37f, -0.574f, 0.423f, -1.289f, 0.14f, -1.911f)
                lineTo(15.0f, 9.783f)
                close()
                moveTo(10.91f, 10.414f)
                curveToRelative(0.06f, -0.13f, 0.09f, -0.271f, 0.09f, -0.414f)
                lineTo(11.0f, 4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 0.143f, 0.03f, 0.284f, 0.09f, 0.414f)
                lineTo(15.177f, 15.0f)
                lineTo(8.825f, 15.0f)
                lineToRelative(2.085f, -4.586f)
                close()
            }
        }
        .build()
        return _bxsFlask!!
    }

private var _bxsFlask: ImageVector? = null
