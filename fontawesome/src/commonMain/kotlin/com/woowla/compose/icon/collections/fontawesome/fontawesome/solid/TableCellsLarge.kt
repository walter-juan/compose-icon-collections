package com.woowla.compose.icon.collections.fontawesome.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.fontawesome.fontawesome.SolidGroup

public val SolidGroup.TableCellsLarge: ImageVector
    get() {
        if (_tableCellsLarge != null) {
            return _tableCellsLarge!!
        }
        _tableCellsLarge = Builder(name = "TableCellsLarge", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(448.0f, 96.0f)
                lineToRelative(0.0f, 128.0f)
                lineToRelative(-160.0f, 0.0f)
                lineToRelative(0.0f, -128.0f)
                lineToRelative(160.0f, 0.0f)
                close()
                moveTo(448.0f, 288.0f)
                lineToRelative(0.0f, 128.0f)
                lineToRelative(-160.0f, 0.0f)
                lineToRelative(0.0f, -128.0f)
                lineToRelative(160.0f, 0.0f)
                close()
                moveTo(224.0f, 224.0f)
                lineTo(64.0f, 224.0f)
                lineTo(64.0f, 96.0f)
                lineToRelative(160.0f, 0.0f)
                lineToRelative(0.0f, 128.0f)
                close()
                moveTo(64.0f, 288.0f)
                lineToRelative(160.0f, 0.0f)
                lineToRelative(0.0f, 128.0f)
                lineTo(64.0f, 416.0f)
                lineToRelative(0.0f, -128.0f)
                close()
                moveTo(64.0f, 32.0f)
                curveTo(28.7f, 32.0f, 0.0f, 60.7f, 0.0f, 96.0f)
                lineTo(0.0f, 416.0f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                lineToRelative(384.0f, 0.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, -28.7f, 64.0f, -64.0f)
                lineToRelative(0.0f, -320.0f)
                curveToRelative(0.0f, -35.3f, -28.7f, -64.0f, -64.0f, -64.0f)
                lineTo(64.0f, 32.0f)
                close()
            }
        }
        .build()
        return _tableCellsLarge!!
    }

private var _tableCellsLarge: ImageVector? = null